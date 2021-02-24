package test0202;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {
    private ServerSocket serversocket;

    public static void main(String[] args) {
        Server1 server1=new Server1();
        server1.start();
    }
    public Server1(){
        try {
            System.out.println("正在启动服务端");
            serversocket=new ServerSocket(9100);
            System.out.println("启动服务端成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void start(){
        try {
            while (true){
                System.out.println("等待客户端连接");
                Socket socket=serversocket.accept();
                System.out.println("一个客户端连接了");
                Runnable handler=new ClientHandler(socket);
                Thread t=new Thread(handler);
                t.start();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private class ClientHandler implements Runnable{
        private Socket socket;
        ClientHandler(Socket socket){
            this.socket=socket;
        }
        public void run(){
           try {
               BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(),"utf-8"));

            String line;
            while ((line=br.readLine())!=null){
                System.out.println("客户端说"+line);
            }
           } catch (IOException e) {
               e.printStackTrace();
           }
        }
    }
}
