package test0127;

import java.io.IOException;
import java.io.RandomAccessFile;

public class test01 {
    public static void main(String[] args) throws IOException {
		RandomAccessFile src = new RandomAccessFile("./test.txt","r");
			//RandomAccessFile desc = new RandomAccessFile("./test_cp.txt","r");  只有读取功能没有写入功能
        RandomAccessFile desc = new RandomAccessFile("./test_cp.txt","rw");

	       byte[] data = new byte[1024*10];

             while( src.read(data)!=-1) { //read里面得有data
                 desc.write(data);                     //没放在循环体里面
             }


				System.err.println("复制完毕!");
                 src.close();
                desc.close();
    }

}

