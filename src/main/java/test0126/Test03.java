package test0126;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Test03 {
    public static void main(String[] args) throws IOException {
        File file=new File(".");
        if (file.isDirectory()) {//判断是不是目录  当前目录
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++) {
                if(files[i].isFile()) {
                    System.out.println( files[i].getName());
                    String [] arr=files[i].getName().split("[.]");
                    RandomAccessFile raf=new RandomAccessFile(arr[0]+"."+arr[1],"r");
                    RandomAccessFile raf1=new RandomAccessFile(arr[0]+"_cp."+arr[1],"rw");
                    int d=raf.read();
                    raf1.write(d);
                    raf1.close();
                    raf.close();

                }



            }
            System.out.println("写出完毕");
        }
    }
}
