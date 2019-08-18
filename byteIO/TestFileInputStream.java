package cn.ttw.byteIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *	 测试字节输入流
 * 
 * read()方法读取的是一个字符，为什么返回值是int，而不是byte
 * 		读到11111111时，byte类型的值为-1，而int类型会在前面自动补8*3个0，值为255
 * 		防止程序需要读此值却意外停止的情况
 * 
 * 
 * 
 */


public class TestFileInputStream {

	public static void main(String[] args) throws IOException {
		//Test1();
		FileInputStream fis = new FileInputStream("xxx.txt");
		int b;
		while((b = fis.read()) != -1) {
			System.out.println(b);
			
		}
		fis.close();
		
	}

	public static void test1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("xxx.txt");
		int x = fis.read();			//从硬盘上读取一个字节
		int y = fis.read();
		System.out.println(x);
		System.out.println(y);
		fis.close();				//关流释放资源
	}
}
