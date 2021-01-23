import com.sun.xml.internal.ws.api.pipe.NextAction;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Test06 {

    public static void main(String[] args) {
        Random rand=new Random();

        char [] arrs=new char[4];
        String str;


        for(int i=0;i<arrs.length;i++){
            int num=  rand.nextInt(75)+48;
            while ((num>57&&num<65)||(num>90&&num<97)){
                num=  rand.nextInt(75)+48;
            }
                    arrs[i]= (char)num;



            System.out.print(arrs[i]);


        }
        /*
         差一步扫描输出出来的char类型的数据，把这个数据变成字符串
         */

        str= String.valueOf(arrs[0]+arrs[1]+arrs[2]+arrs[3]);


        System.out.println();
        System.out.println("请输入验证码：");
        Scanner scan=new Scanner(System.in);

            String str1= scan.nextLine();
           String a= str1.toLowerCase();
        System.out.println("a:"+a);

          if(a.equals(str)){
                System.out.println("验证正确");
            }else{
                System.out.println("验证错误");
            }
    }


}
