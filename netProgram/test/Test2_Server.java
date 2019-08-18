package cn.ttw.netProgram.test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 客户端上传文件至服务器
 */


public class Test2_Server {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(6666);
        System.out.println("服务器启动，绑定6666端口号");

        while (true) {
            final Socket socket = server.accept();
            new Thread() {
                public void run() {
                    try {
                        InputStream is = socket.getInputStream();
                        BufferedReader br = new BufferedReader(new InputStreamReader(is));
                        PrintStream ps = new PrintStream(socket.getOutputStream());
                        String fileName = br.readLine();


                        File dir = new File("update");
                        dir.mkdir();
                        File file = new File(dir, fileName);        //封装成file对象

                        if (file.exists()) {
                            ps.println("存在");
                            socket.close();
                            return;
                        } else {
                            ps.println("不存在");
                        }

                        FileOutputStream fos = new FileOutputStream(file);
                        byte[] arr = new byte[8192];
                        int len;

                        while ((len = is.read(arr)) != -1) {
                            fos.write(arr, 0, len);
                        }



                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }


    }
}
