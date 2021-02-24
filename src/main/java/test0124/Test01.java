public class Test01 {
    public static void main(String[] args) {
        String fileName1="logo.png";
        String fileName2="jquery.1.1.2.js";

       String ext=getExtByName(fileName1);
        System.out.println(ext);
        ext=getExtByName(fileName2);
        System.out.println(ext);

    }
   public static String getExtByName(String name){
    String str =  name.substring(name.lastIndexOf(".")+1);
            return str;

    }
}
