import com.sun.javafx.image.BytePixelSetter;
import com.sun.org.apache.xpath.internal.operations.Equals;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {


        do {   System.out.println("请输入用户名：");
              Scanner scan=new Scanner(System.in);
              String name =scan.next();


            if (name.length() <= 1) {
                System.out.println("用户名不能为空");
            } else if (name.length() >= 20) {
                System.out.println("用户名必须在20个字以内");
            } else if(name.equals("退出")) {
                break;
            }else {
                    System.out.println("欢迎，" + name + "!!!");
                    System.out.println("请继续");
                }

        }while (!System.in.equals("退出"));

    }
}
