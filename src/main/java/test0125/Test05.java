package test0125;

import java.util.Scanner;

public class Test05 {

    public static void main(String[] args) {
        Person p = new Person();
    	Scanner scanner = new Scanner(System.in);  //Scanner 少个a  System 首字母大写
		System.out.println("请输入姓名:");
		String name = scanner.nextLine();
		if(name.length()==0) {
			System.out.println("姓名不能为空!");
		}else{
			p.setName(name);
		}
		System.out.println("请输入年龄:");
		int age = scanner.nextInt();
		if(age<0||age>100) {
			System.out.println("年龄不合法!");
		}else{
			p.setAge(age);
		}

		System.out.println("姓名:"+p.getName());
		System.out.println("年龄:"+p.getAge());
    }


}
class Person{
    private String name;
    private int age;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
