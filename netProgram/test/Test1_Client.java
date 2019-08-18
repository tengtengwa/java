package cn.ttw.netProgram.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * 客户端向服务器键盘录入字符串，服务器（多线程）将字符串反转后写回，客户端再次读取反转后的字符串
 */

public class Test1_Client {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Socket socket = new Socket("127.0.0.1", 6666);      //端口号不超过65535

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));     //获取输入了
        PrintStream ps = new PrintStream(socket.getOutputStream());     //获取输出流

        ps.println(sc.nextLine());              //将录入的字符串写到服务器
        System.out.println(br.readLine());      //将反转后的结果读出来

        socket.close();

    }
}
