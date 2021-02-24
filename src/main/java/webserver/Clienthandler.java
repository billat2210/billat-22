package webserver;

import http.HttpRequest;

import java.io.*;
import java.net.Socket;

public class Clienthandler implements Runnable {
    private Socket socket;
    public Clienthandler(Socket socket){
        this.socket=socket;
    }
    public void run(){


        try {
            //解析请求
            HttpRequest request=new HttpRequest(socket);
            //处理请求
            //处理响应
            File file =new File("./webapps/myweb/index.html");
            /*
            一个响应的大致内容：
            HTTP/1.1 200 OK(CRLF)
            Content-Type: text/html(CRLF)
            Content-Length: 2546(CRLF)(CRLF)
            1011101010101010101......
          */
            OutputStream out=socket.getOutputStream();
           //1:发送状态行
            String line="HTTP/1.1 200 OK";
            byte[] data=line.getBytes("ISO8859-1");
            out.write(data);
            out.write(13);
            out.write(10);
            //发送响应头
            line="Content-Type: text/html";
            data=line.getBytes("ISO8859-1");
            out.write(data);
            out.write(13);
            out.write(10);
            line="Content-Length: "+file.length();
            data=line.getBytes("ISO8859-1");
            out.write(data);
            out.write(13);
            out.write(10);
            out.write(13);
            out.write(10);
            FileInputStream fis=new FileInputStream(file);
            int len;
            byte[] bur=new byte[1024*10];
            while ((len=fis.read(bur))!=-1){
                out.write(bur);
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
}
