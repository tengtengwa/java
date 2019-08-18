package cn.ttw.netProgram.tcp;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
    public static void main(String[] args) {
        startServer = new startServer();
        startServer.start();
    }

    public static ArrayList<UserThread> socketList = new ArrayList<>();
    public static startServer startServer;

    static class startServer extends Thread {
        public void run() {
            try {
                ServerSocket serverSocket = new ServerSocket(6666, 50, InetAddress.getByName("192.168.1.150"));
                while (true) {
                    Socket socket = serverSocket.accept();
                    System.out.println("" + socket);
                    UserThread userThread = new UserThread(socket);
                    Server.socketList.add(userThread);
                    new Thread(userThread).start();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    static class UserThread implements Runnable {

        private Socket skt;
        private DataOutputStream dos;
        private DataInputStream dis;

        public DataOutputStream getDos() {
            return dos;
        }

        public void setDos(DataOutputStream dos) {
            this.dos = dos;
        }

        public DataInputStream getDis() {
            return dis;
        }

        public void setDis(DataInputStream dis) {
            this.dis = dis;
        }

        public UserThread(Socket socket) {
            skt = socket;
        }


        @Override
        public void run() {

            try {
                dos = new DataOutputStream(skt.getOutputStream());
                dis = new DataInputStream(skt.getInputStream());

                String recMsg = "";
                while (true) {
                    if (!"".equals(recMsg = dis.readUTF())) {    //服务器接收到数据
                        System.out.println("收到了一条消息" + recMsg);
                        for (UserThread s : socketList) {
                            if (s.equals(this)) {                        //跳过sktList中自己的socket
                                continue;
                            }
                            try {
                                s.getDos().writeUTF(recMsg);
                            } catch (IOException e) {
//                                socketList.remove(s);
                                e.printStackTrace();
                            }
                        }
                        recMsg = "";
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }





}



