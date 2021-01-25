package test0125;

public class Test02 {
    public static void main(String[] args) {
      /*  String path = "http://localhost:8088/myweb/reg?name=zhangsan";
            String[] str=path.split("[?]+");
                System.out.println("请求："+str[0]);
                System.out.println("参数："+str[1]);
*/

        String path = "http://localhost:8088/myweb/reg?name=zhangsan";
            String [] str=path.split("[?]");
        System.out.println("请求："+str[0]);
        System.out.println("参数："+str[1]);






                }


    }

