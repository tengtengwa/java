package cn.ttw.byteIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyChinese {

	public static void main(String[] args) throws IOException {
		//Test1();
		FileOutputStream fos = new FileOutputStream("zzz.txt");
		fos.write("Œ“ «≤Àº¶£¨".getBytes());
		fos.write("\r\nƒ„ «≤À–ÈˆÔ".getBytes());
		fos.close();
		
		
		
	}

	public static void test1() throws IOException {
		FileInputStream fis = new FileInputStream("yyy.txt");
		byte[] arr = new byte[2];
		int len;
		while((len = fis.read(arr)) != -1) {
			System.out.print(new String(arr, 0, len));
		}
		
		fis.close();
	}
}
