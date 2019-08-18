package cn.ttw.netProgram.test;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Test2_Client {
    public static void main(String[] args) throws IOException {
        File file = getFile();
        Socket socket = new Socket("127.0.0.1", 6666);
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintStream ps = new PrintStream(socket.getOutputStream());
        ps.println(file.getName());

        String result = br.readLine();
        if ("存在".equals(result)) {
            System.out.println("文件已存在，无需上传");
            socket.close();
        } else {
            FileInputStream fis = new FileInputStream(file);
            byte[] arr = new byte[1024];
            int len;

            while ((len = fis.read(arr)) != -1) {
                ps.write(arr, 0, len);
            }

            fis.close();
            socket.close();
        }


    }

    private static File getFile() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入文件路径: ");
        while (true) {
            String line = sc.nextLine();
            File file = new File(line);
            if (!file.exists()) {
                System.out.println("录入的文件路径不存在，请重新录入");
            } else if (file.isDirectory()) {
                System.out.println("录入了文件夹路径，请重新录入");
            } else {
                return file;
            }
        }

    }
}
