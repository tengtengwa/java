package cn.ttw.netProgram.socket;

import java.net.*;
import java.util.Scanner;

public class Send {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        DatagramSocket socket = new DatagramSocket();       //相当于创建码头

        while (true) {
            String str = sc.nextLine();
            if("quit".equals(str)) {
                break;
            }else {
                DatagramPacket packet = new DatagramPacket(str.getBytes(), str.getBytes().length,   //相当于集装箱
                        InetAddress.getByName("127.0.0.1"), 6666);
                socket.send(packet);
            }
        }
        socket.close();                 //关闭码头

    }

}
