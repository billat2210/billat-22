package test0126;

import java.io.File;
import java.io.FileFilter;
import java.util.logging.Filter;

public class Test02 {
    public static void main(String[] args) {
       File file=new File(".");
       if(file.isDirectory()){
           FileFilter filters=new FileFilter(){
               public boolean accept(File file) {
                   return file.getName().contains("s");
               }
           };
           File[] files=file.listFiles(filters);
           for(int i=0;i<files.length;i++){
               System.out.println(files[i]);
           }
       }
    }
}
