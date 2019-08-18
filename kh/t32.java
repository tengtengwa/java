package cn.ttw.kh;

import sun.security.util.Length;

import java.io.IOException;
import java.io.RandomAccessFile;

public class t32 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("ooo.txt","rw");
        long len = raf.length() - 1;

        while(len > 0){
            raf.seek(len);
            len--;
            //char b = raf.read();

            //System.out.println(b);
        }
        raf.close();
    }
}
