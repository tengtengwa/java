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
//                    InputStream is = null;     //���ֽ�����װ���ַ���
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

//                    ps.println("��ӭ����ͬ־�ع�");
//                    try {
//                        System.out.println(br.readLine());
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                    ps.println("����ͬ־NB");
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

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));     //���ֽ�����װ���ַ���
        PrintStream ps = new PrintStream(socket.getOutputStream());

        ps.println("��ӭ����ͬ־�ع�");
        System.out.println(br.readLine());
        ps.println("����ͬ־NB");
        System.out.println(br.readLine());

        socket.close();
    }

    public static void test1() throws IOException {
        ServerSocket server = new ServerSocket(12345);
        Socket socket = server.accept();                     //���տͻ�������
        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();

        os.write("���Ǵ�����ͬ־".getBytes());                 //��������ͻ���д������
        byte[] arr = new byte[1024];
        int len = is.read(arr);                                 //��ȡ�ͻ��˷���������
        System.out.println(new String(arr, 0, len));

        socket.close();
    }


}