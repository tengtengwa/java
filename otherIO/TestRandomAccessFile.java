package cn.ttw.otherIO;
import	java.io.IOException;
import	java.io.RandomAccessFile;

/**
 * ���������
 */

public class TestRandomAccessFile {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("xxx.txt","rw");
//        raf.write(97);
//        int x = raf.read();
//        System.out.println(x);

        raf.seek(0);        //��ָ��λ������ָ��
        raf.write(98);
        raf.close();
	}
}
