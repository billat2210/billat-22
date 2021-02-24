package test0129;

import sun.font.TrueTypeFont;
import sun.security.util.Length;

import java.io.*;
import java.nio.Buffer;
import java.sql.SQLOutput;
import java.time.format.FormatStyle;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.BooleanSupplier;

/**
 * 写了一半  提高没写完
 */
public class test03 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入用户名:");
                     String name=scan.nextLine();

        System.out.println("请输入密码:");
                String pwd=scan.nextLine();


        System.out.println("请输入昵称:");
                     String nick=scan.nextLine();

        System.out.println("请输入年龄：");
                     int age=scan.nextInt();



            User user =new User(name,pwd,nick,age);
        FileOutputStream fos=new FileOutputStream(name+".obj");

        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(user);

        FileInputStream fis=new FileInputStream(name+".obj");

        ObjectInputStream ois=new ObjectInputStream(fis);
       User user1=(User)ois.readObject();
       if(user1.name.length()<=32||user1.name.length()>0&&user.nick.length()!=0&&user1.pwd.length() !=0&&(age>=0&&age<=100)) {
           String str = "[0-9a-zA-Z_]+";
           boolean match = user1.name.matches(str);

           if (match){
               System.out.println("写入完成");

           }else{
               System.out.println("输入错误");

           }
       }
        oos.close();














    }

        }

    class User implements  Serializable{
        String name;
        String pwd;
        String nick;
        int age;

        public User(String name, String pwd, String nick, int age) {
            this.name = name;
            this.pwd = pwd;
            this.nick = nick;
            this.age = age;
        }

        @Override
        public String toString() {
            return "user{" +
                    "name='" + name + '\'' +
                    ", pwd='" + pwd + '\'' +
                    ", nick='" + nick + '\'' +
                    ", age=" + age +
                    '}';
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPwd() {
            return pwd;
        }

        public void setPwd(String pwd) {
            this.pwd = pwd;
        }

        public String getNick() {
            return nick;
        }

        public void setNick(String nick) {
            this.nick = nick;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }


}
