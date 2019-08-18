package cn.ttw.netProgram.socket;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class MultiThread {
    public static void main(String[] args) {
        new Receive2().start();
        new Send2().start();


    }



}

class Receive2 extends Thread {
    public void run() {
        DatagramSocket socket = null;       //创建码头
        try {
            socket = new DatagramSocket(6666);
        } catch (SocketException e) {
            e.printStackTrace();
        }
        DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);   //创建集装箱

        while (true) {
            try {
                socket.receive(packet);
            } catch (IOException e) {
                e.printStackTrace();
            }
            byte[] arr = packet.getData();
            int len = packet.getLength();       //获取有效的字节个数
            String ip = packet.getAddress().getHostAddress();       //获取ip地址
            int port = packet.getPort();                            //获取端口号
            System.out.println(ip + ":" + port + ":" + new String(arr, 0, len));

        }
    }
}

class Send2 extends Thread {
    public void run() {
        Scanner sc = new Scanner(System.in);
        DatagramSocket socket = null;       //相当于创建码头
        try {
            socket = new DatagramSocket();
        } catch (SocketException e) {
            e.printStackTrace();
        }

        while (true) {
            String str = sc.nextLine();
            if("quit".equals(str)) {
                break;
            }else {
                DatagramPacket packet = null;
                try {
                    packet = new DatagramPacket(str.getBytes(), str.getBytes().length,   //相当于集装箱
                            InetAddress.getByName("127.0.0.1"), 6666);
                } catch (UnknownHostException e) {
                    e.printStackTrace();
                }
                try {
                    socket.send(packet);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        socket.close();                 //关闭码头
    }
}