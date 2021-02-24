package test0126;

import jdk.nashorn.internal.ir.LexicalContextNode;

import java.io.File;
import java.io.FileFilter;
import java.nio.channels.FileLockInterruptionException;

public class Test2 {
    public static void main(String[] args) {
        File file =new File(".");
       if(file.isDirectory()) {
           FileFilter filter = (pathname) ->
                   pathname.getName().contains("s");
           File[] files = file.listFiles(filter);
           for (int i = 0; i < files.length; i++) {
               System.out.println(files[i]);
           }

       }else{
           System.out.println("没有该文件夹");
       }















        /* File file=new File(".");
     FileFilter filter=new FileFilter() {
         public boolean accept(File pathname) {
             return pathname.getName().contains("s");
         }
     };
     File [] files=file.listFiles(filter);
     for (int i=0;i<files.length;i++){
         System.out.println(files[i]);
     }*/















      /*  File file=new File(".");
        FileFilter filter=new FileFilter() {
            public boolean accept(File pathname) {
                return pathname.getName().contains("s");
            }
        };
       File[] files=file.listFiles(filter);
       for(int i=0;i<files.length;i++){
           System.out.println(files[i]);
       }*/


    }
}
