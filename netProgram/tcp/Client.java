package cn.ttw.netProgram.tcp;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //test1();

        Socket socket = new Socket("192.168.1.150", 6666);
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));     //���ֽ�����װ���ַ���
        PrintStream ps = new PrintStream(socket.getOutputStream());     //PrintStream����д�����еķ���

        ps.println("�����ҵ�����!");
        System.out.println(br.readLine());
        ps.println("һ���");
        System.out.println(br.readLine());

        socket.close();
    }

    public static void test1() throws IOException {
        Socket socket = new Socket("127.0.0.1", 12345);
        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();

        byte[] arr = new byte[1024];
        int len = is.read(arr);                                 //��ȡ����������������
        System.out.println(new String(arr, 0, len));    //������ת��Ϊ�ַ�������ӡ
        os.write("ͬ־������".getBytes());                      //�ͻ����������д����

        socket.close();
    }
}
