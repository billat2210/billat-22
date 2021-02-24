package test0127;

import sun.applet.Main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * 用户登录功能
 * 程序启动后，要求用户输入用户名和密码
 * 然后去user.dat文件中比对
 * 成功则输出:登录成功
 * 失败则输出:登录失败，用户名或密码不正确
 *
 * 登录失败的条件:用户名输入正确但是密码不正确，或者用户名
 * 输入不正确(user.dat文件中没有此人)
 *
 * @author Xiloer
 *
 */
public class test03 {
    public static void main(String[] args) throws IOException {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username=scan.nextLine();
        System.out.println("请输入密码");
        String password=scan.nextLine();
        RandomAccessFile raf=new RandomAccessFile("user.dat","r");
        byte[] data=new byte[32];
        for(int i=0;i<raf.length()/100;i++) {
           raf.seek(i * 100);
           raf.read(data);
           String strname = new String(data,"utf-8").trim();
           System.out.println("用户名为：" + strname);//打桩查看用户名
           raf.read(data);
           String passname=new String(data,"utf-8").trim();
           System.out.println("密码为：" + passname);//打桩查看密码用户名为：张玉琪  密码为：13546654

           if (username.equals(strname) && password.equals(passname)) {
               System.out.println("登录成功");
               break;
           }
           if(!username.equals(strname)||(username.equals(strname) && !password.equals(passname))){
               System.out.println("用户名或密码不正确");
           }

       }



    }
}
