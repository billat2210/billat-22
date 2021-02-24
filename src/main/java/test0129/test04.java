package test0129;

import java.io.*;

public class test04 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file=new File("./");
        if(file.isDirectory()){
            FileFilter filter=new FileFilter() {

                public boolean accept(File file1) {
                    return file1.getName().endsWith(".obj");
                }
            };
            File [] subs=file.listFiles(filter);
            for (int i=0;i<subs.length;i++) {
                FileInputStream fis = new FileInputStream(subs[i]);
                ObjectInputStream ois=new ObjectInputStream(fis);

                System.out.println(ois.readObject());
            }
            }
    }
}
