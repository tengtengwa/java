package cn.ttw.kh.kh;

import java.io.File;
import java.io.RandomAccessFile;

public class t3 {
    public static void main(String args[]) {
        File file = new File("C:\\Users\\腾腾娃发光的板砖\\Desktop\\haha.txt");
        try {
            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            long len = file.length();
            raf.seek(len);
            while (len > 0) {
                len--;
                raf.seek(len);                   //读取前更新文件指针位置
                int ch = raf.readByte();
                if (ch <= 255 && ch >= 0) {
                    System.out.print((char) ch);
                } else {                         //是汉字就再退一个字节
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