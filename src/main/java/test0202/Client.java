package test0202;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * 聊天室客户端
 */
public class Client {
    private Socket socket;

    public  Client(){

        try {
            System.out.println("正在连接服务端");
            socket =new Socket("localhost",8188);
            System.out.println("与服务其连接成功");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void start(){
        try (
            PrintWriter pw=new PrintWriter(
                    new BufferedWriter(
                            new OutputStreamWriter(
                                    socket.getOutputStream(),"utf-8")),
                    true);
            ) {
            Scanner scan=new Scanner(System.in);
            System.out.println("请输入内容，输入exit离开");
            while(true){
                String line=scan.nextLine();
                if("exit".equals(line)){
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
        Client client=new Client();
        client.start();
    }
}
