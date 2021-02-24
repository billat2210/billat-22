package test0129;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class test01 {
    public static void main(String[] args) throws IOException {
		FileInputStream fis
	= new FileInputStream("test.txt");
		FileOutputStream fos
		= new FileOutputStream("test_cp.txt");
    byte[] data=new byte[1024*10];
		   int d=0;
				while((d = fis.read(data))!=-1) {
				fos.write(data);
					}
				System.out.println("复制完毕!");
					fis.close();
	fos.close();
    }
}
