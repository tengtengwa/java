package cn.ttw.netProgram.tcp;


import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class demo_Server {
    public static void main(String[] args) throws IOException {
        //test1();
        //test2();

//        ServerSocket server = new ServerSocket(6666,50, InetAddress.getByName ("192.168.1.150"));

//        while (true) {
//            Socket socket = server.accept();
//            System.out.println("" + socket);
//            new Thread() {
//                public void run() {
//                    InputStream is = null;     //将字节流包装成字符流
//                    OutputStream os = null;
//
//                    try {
//                        is = socket.getInputStream();
//                        os = socket.getOutputStream();
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }.start();
//        }

//        startServer = new startServer();
//        startServer.start();


    }
//                    byte[] arr = new byte[8*1024];
//                    int len;
//                    while (true) {
//                        try {
//                            if ((len = is.read(arr)) != -1) {
//                                System.out.println(is.read(arr));
//                            }
//                        } catch (IOException e) {
//                            e.printStackTrace();
//                        }
//                    }

//                    try {
//                        System.out.println(br.readLine());
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }

//                    ps.println("欢迎建国同志回国");
//                    try {
//                        System.out.println(br.readLine());
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                    ps.println("建国同志NB");
//                    try {
//                        System.out.println(br.readLine());
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//
//                    try {
//                        socket.close();
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }


    public static void test2() throws IOException {
        ServerSocket server = new ServerSocket(12345);
        Socket socket = server.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));     //将字节流包装成字符流
        PrintStream ps = new PrintStream(socket.getOutputStream());

        ps.println("欢迎建国同志回国");
        System.out.println(br.readLine());
        ps.println("建国同志NB");
        System.out.println(br.readLine());

        socket.close();
    }

    public static void test1() throws IOException {
        ServerSocket server = new ServerSocket(12345);
        Socket socket = server.accept();                     //接收客户端请求
        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();

        os.write("我是川建国同志".getBytes());                 //服务器向客户端写出数据
        byte[] arr = new byte[1024];
        int len = is.read(arr);                                 //读取客户端发来的数据
        System.out.println(new String(arr, 0, len));

        socket.close();
    }


}