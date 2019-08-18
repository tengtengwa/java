package cn.ttw.otherIO;

import java.io.*;

public class TestDataInputStream {
    public static void main(String[] args) throws IOException {
        //test1();
        //test2();
        //test3();

        DataInputStream dis = new DataInputStream(new FileInputStream("yyy.txt"));
        int x = dis.readInt();
        int y = dis.readInt();
        int z = dis.readInt();

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        dis.close();

    }

    private static void test3() throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("yyy.txt"));
        dos.writeInt(997);
        dos.writeInt(998);
        dos.writeInt(999);

        dos.close();
    }

    private static void test2() throws IOException {
        FileInputStream fis = new FileInputStream("yyy.txt");
        int x = fis.read();
        int y = fis.read();
        int z = fis.read();

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        fis.close();
    }

    private static void test1() throws IOException {
        FileOutputStream fos = new FileOutputStream("yyy.txt");
        fos.write(997);
        fos.write(998);
        fos.write(999);

        fos.close();
    }
}
