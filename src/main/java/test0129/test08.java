package test0129;

import com.sun.media.jfxmedia.events.BufferListener;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * 读取content.txt文件
 *
 * 进阶:
 * 实现readLine方法，每调用一次就返回content.txt中的一句
 *
 * 思考:
 * 如果每次都在readLine方法中重新创建输入流，那么总是从头
 * 开始读。只有每次调用readLine看到的输入流都是同一个时，
 * 那么每次调用后开始读取的才是上一次读取后的内容。
 * @author Xiloer
 *
 */
public class test08 {
    private static FileInputStream fis;

    static {
        try {
            fis = new FileInputStream("content.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        String line = readLine();
        //hello world
        System.out.println(line);

        line = readLine();
        //thinking in java
        System.out.println(line);

        line = readLine();
        //i love java
        System.out.println(line);
    }
    public static String readLine() throws IOException {
        StringBuilder builder= new StringBuilder();
        int d;
        while ((d=fis.read())!=-1){
                char c=(char)d;

                if (c=='.'){
                   break;
                }
            builder.append(c);
        }


        return builder.toString();
    }
}
