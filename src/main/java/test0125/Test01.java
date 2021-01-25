package test0125;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
      String str="[0-9]+";
        String str1="[a-zA-Z0-9_]{3,15}";
        System.out.println("请输入用户名");
        Scanner scan=new Scanner(System.in);
        String input=scan.nextLine();
       if (!input.matches(str1)){
           System.out.println("用户名有误");
       }else {
           System.out.println("请输入年龄：");
           String age=scan.nextLine();
           if(!age.matches(str)){
               System.out.println("年龄有误");
           }else{
              int a =  Integer.parseInt(age);
                    if(a>=100||a<=0){
                        System.out.println("请正确输入年龄");
                    }

                   }
               }
           }
       }



