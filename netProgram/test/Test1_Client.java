package cn.ttw.netProgram.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * �ͻ��������������¼���ַ����������������̣߳����ַ�����ת��д�أ��ͻ����ٴζ�ȡ��ת����ַ���
 */

public class Test1_Client {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Socket socket = new Socket("127.0.0.1", 6666);      //�˿ںŲ�����65535

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));     //��ȡ������
        PrintStream ps = new PrintStream(socket.getOutputStream());     //��ȡ�����

        ps.println(sc.nextLine());              //��¼����ַ���д��������
        System.out.println(br.readLine());      //����ת��Ľ��������

        socket.close();

    }
}
