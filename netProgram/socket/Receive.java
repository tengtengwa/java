package cn.ttw.netProgram.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receive {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(6666);       //创建码头
        DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);   //创建集装箱

        while (true) {
            socket.receive(packet);
            byte[] arr = packet.getData();
            int len = packet.getLength();       //获取有效的字节个数
            String ip = packet.getAddress().getHostAddress();       //获取ip地址
            int port = packet.getPort();                            //获取端口号
            System.out.println(ip + ":" + port + ":" + new String(arr, 0, len));

        }

    }
}
