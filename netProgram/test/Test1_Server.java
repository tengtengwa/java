package cn.ttw.netProgram.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test1_Server {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(6666);
        System.out.println("服务器启动，绑定6666端口");

        while (true) {
            final Socket socket1 = server.accept();             //接收客户端请求

            new Thread() {
                public void run() {
                    try {
                        BufferedReader br = new BufferedReader(new InputStreamReader(socket1.getInputStream()));
                        PrintStream ps = new PrintStream(socket1.getOutputStream());
                        String line = br.readLine();
                        line = new StringBuilder(line).reverse().toString();        //链式编程
                        ps.println(line);

                        socket1.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
            }.start();
        }

    }
}
