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
        if ("����".equals(result)) {
            System.out.println("�ļ��Ѵ��ڣ������ϴ�");
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
        System.out.println("�������ļ�·��: ");
        while (true) {
            String line = sc.nextLine();
            File file = new File(line);
            if (!file.exists()) {
                System.out.println("¼����ļ�·�������ڣ�������¼��");
            } else if (file.isDirectory()) {
                System.out.println("¼�����ļ���·����������¼��");
            } else {
                return file;
            }
        }

    }
}
