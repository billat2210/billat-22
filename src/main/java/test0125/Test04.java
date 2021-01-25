package test0125;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        /*
         * 原因: 双引号和字符串中间有个空格
         */
        String num = "123";
        int d = Integer.parseInt(num);
        System.out.println(d);
        /*
         * 原因: 类型不匹配  字符串的数字类型是double型，应该用double 来接收
         */
        num = "123.456";
      double  d1 = Double.parseDouble(num);
        System.out.println(d1);

        /*
         * 原因:
         */
//		num = "123";
//		d = Integer.parseInt(num)；
//		System.out.println(d);
    }
}
