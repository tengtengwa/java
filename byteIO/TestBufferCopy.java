package cn.ttw.byteIO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestBufferCopy {

	public static void main(String[] args) throws IOException {
		//Test1();
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\腾腾娃发光的板砖\\Desktop\\文件夹\\test.txt"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\腾腾娃发光的板砖\\Desktop\\copy.txt"));
		
		int b;
		while((b = bis.read()) != -1) {
			bos.write(b);
		}
		
		bos.flush();		//具备刷新的功能，刷完之后可以继续写，而close方法刷完不可以继续写
		bis.close();
		bos.close();		//close方法具备刷新的功能，在关闭流之前，会先刷新一次缓冲区，将缓冲区的字节全部刷新到文件中，再关闭
		
	}

	public static void test1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\腾腾娃发光的板砖\\Desktop\\文件夹\\test.txt");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\腾腾娃发光的板砖\\Desktop\\copy.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
//		BufferedInputStream bis1 = new BufferedInputStream(new FileInputStream("C:\\Users\\腾腾娃发光的板砖\\Desktop\\文件夹\\test.txt"));
//		BufferedOutputStream bos1 = new BufferedOutputStream(new FileOutputStream("C:\\Users\\腾腾娃发光的板砖\\Desktop\\copy.txt"));
		
		
		int b;
		while((b = bis.read()) != -1) {
			bos.write(b);
		}
		bis.close();
		bos.close();
	}
}
