package cn.ttw.kh.kh;

import java.io.File;
import java.io.RandomAccessFile;

public class t3 {
    public static void main(String args[]) {
        File file = new File("C:\\Users\\�����޷���İ�ש\\Desktop\\haha.txt");
        try {
            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            long len = file.length();
            raf.seek(len);
            while (len > 0) {
                len--;
                raf.seek(len);                   //��ȡǰ�����ļ�ָ��λ��
                int ch = raf.readByte();
                if (ch <= 255 && ch >= 0) {
                    System.out.print((char) ch);
                } else {                         //�Ǻ��־�����һ���ֽ�
                    len--;
                    raf.seek(len);
                    byte[] arr = new byte[2];
                    raf.read(arr);
                    System.out.print(new String(arr));
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}