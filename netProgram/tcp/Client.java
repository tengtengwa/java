package cn.ttw.netProgram.tcp;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //test1();

        Socket socket = new Socket("192.168.1.150", 6666);
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));     //将字节流包装成字符流
        PrintStream ps = new PrintStream(socket.getOutputStream());     //PrintStream中有写出换行的方法

        ps.println("啊，我的人民!");
        System.out.println(br.readLine());
        ps.println("一般吧");
        System.out.println(br.readLine());

        socket.close();
    }

    public static void test1() throws IOException {
        Socket socket = new Socket("127.0.0.1", 12345);
        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();

        byte[] arr = new byte[1024];
        int len = is.read(arr);                                 //读取服务器发来的数据
        System.out.println(new String(arr, 0, len));    //将数据转换为字符串并打印
        os.write("同志辛苦了".getBytes());                      //客户端向服务器写数据

        socket.close();
    }
}
