package cn.ttw.otherIO;
import	java.io.IOException;
import	java.io.RandomAccessFile;

/**
 * 随机访问流
 */

public class TestRandomAccessFile {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("xxx.txt","rw");
//        raf.write(97);
//        int x = raf.read();
//        System.out.println(x);

        raf.seek(0);        //在指定位置设置指针
        raf.write(98);
        raf.close();
	}
}
