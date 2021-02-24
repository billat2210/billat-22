package test0223;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Test0224 {
    public static void main(String[] args) throws IOException {
        File file =new File("./billat2210.txt");
        if(file.exists()){
            System.out.println("文件存在");
        }else{
            System.out.println("文件不存在");
        }
        File file4 = new File("E:\\test\\a\\b\\c");
        file4.mkdirs();
        System.out.println("测试file4是否是文件夹"+file4.isDirectory());
        System.out.println("测试file4是否是文件"+file4.isFile());
        System.out.println("测试file4是否存在"+file4.exists());
        Writer writer = new FileWriter("./content.txt");
        //每写入一次会覆盖之前的内容
        char[] chars = {'女','友','朋','很','帅'};
        writer.write(chars,0,3);
        writer.write("好好学习");
        writer.close();

    }

}
