package test0126;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) throws IOException {
        System.out.println("请输入一个文件名");
        Scanner scan=new Scanner(System.in);
        String strName=scan.nextLine();
        File file=new File(strName);

       while (file.exists()){
           System.out.println("请重新出入");
           strName=scan.nextLine();
        }
            file.createNewFile();
    }
}
