package cn.ttw.byteIO;

/**
 *	 测试字节输出流
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutStream {

	public static void main(String[] args) throws IOException {
		//Test1();
		FileOutputStream fos = new FileOutputStream("yyy.txt",true);	//想续写就调用其构造方法，给第二个参数传入true
		fos.write(97);
		fos.write(98);
		
		fos.close();
		
		
	}

	public static void test1() throws FileNotFoundException, IOException {
		FileOutputStream fos = new FileOutputStream("yyy.txt");		//创建字节输出流对象，如果没有就自动创建一个；如果有此文件，会将文件先清空
		
//		fos.write(97);		//虽然写出的是一个int数，但到文件上是一个字节，会自动去除前面的3个8位
//		fos.write(98);
//		fos.write(99);
		fos.write(100);
		
		
		fos.close();
	}
}
