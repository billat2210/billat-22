package test0202;

import javax.sound.sampled.Line;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client1 {
    private Socket socket;
    public Client1(){
        try {
            System.out.println("正在连接服务端");
            socket =new Socket("localhost",9100);
            System.out.println("连接成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void start(){

        try( PrintWriter pw=new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(),"utf-8")),true);
        ) {
           Scanner scan=new Scanner(System.in);
            System.out.println("请输入内容，输入exit退出");


            while(true){
                String line=scan.nextLine();
                if ("exit".equals(line)){
                    break;
                }
                pw.println(line);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        Client1 client1=new Client1();
        client1.start();
    }
}
