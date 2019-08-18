package cn.ttw.byteIO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {

	public static void main(String[] args) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("copy.jpg"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy2.jpg"));
		
		int b;
		while((b = bis.read()) != -1) {
			bos.write(b ^ 666);			//将每个字节异或一个数，这个数就是密钥，解密时再次异或即可解密
		}
		
		bis.close();
		bos.close();
		
		
	}
}
