package cn.ttw.netProgram.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receive {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(6666);       //������ͷ
        DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);   //������װ��

        while (true) {
            socket.receive(packet);
            byte[] arr = packet.getData();
            int len = packet.getLength();       //��ȡ��Ч���ֽڸ���
            String ip = packet.getAddress().getHostAddress();       //��ȡip��ַ
            int port = packet.getPort();                            //��ȡ�˿ں�
            System.out.println(ip + ":" + port + ":" + new String(arr, 0, len));

        }

    }
}
