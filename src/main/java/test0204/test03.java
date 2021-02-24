package test0204;

import java.util.*;

/**
        * 生成10个0-100之间的不重复的随机数,并输出
        * @author Xiloer
        *
        */
public class test03 {
            public static void main(String[] args) {
                Random random=new Random();
               Set<Integer> c= new HashSet<>();
                  for(int i=0;i<10;i++) {
                      c.add(random.nextInt(101));

                  }
                System.out.println(c.size());
                  System.out.println(c);
            }
}
