package http;

import com.sun.net.httpserver.Headers;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class HttpRequest {
    private String method;
    private String uir;
    private String protocol;
    private Map<String,String> headrs=new HashMap<>();
    private Socket socket;
    public HttpRequest(Socket socket){
        this.socket=socket;

        parseRequestLine();
        parseHeaders();
        parseContent();

    }
    private void parseRequestLine(){
        System.out.println("HttpRequest:开始解析请求行...");
        try {
            String line=readline();
            String [] data=line.split("\\s");
            method=data[0];
            uir=data[1];
            protocol=data[2];
            System.out.println("method"+method);
            System.out.println("uir："+uir);
            System.out.println("protocol："+protocol);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("HttpRequest：请求解析完毕");
    }
    private void parseHeaders(){
        try {
            System.out.println("开始解析消息头");
         while (true){
             String line=readline();
            if(line.isEmpty()){
                break;
            }
             System.out.println("消息头"+line);
            String []data=line.split(":\\s");
            headrs.put(data[0],data[1]);

         }
            System.out.println("headers:"+ headrs);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("HttpRequest:消息头解析完毕");
    }
    private void parseContent(){
        System.out.println("开始解析消息正文");
        System.out.println("正文解析完毕！");
    }
    private String readline() throws IOException{
        InputStream in=socket.getInputStream();
        int d;
        char cur=' ';
        char pur=' ';

        StringBuilder builder=new StringBuilder();
        while((d=in.read())!=-1){
            cur=(char)d;
            if(pur==13&&cur==10){
                break;
            }
            builder.append(cur);
            pur=cur;
        }
        return builder.toString().trim();
    }
}
