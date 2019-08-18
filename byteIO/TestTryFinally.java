package cn.ttw.byteIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestTryFinally {

	public static void main(String[] args) throws IOException {
		//Test1();
		
		try(
			FileInputStream fis = new FileInputStream("xxx.txt");
			FileOutputStream fos = new FileOutputStream("yyy.txt");
		){
			int b;
			while((b = fis.read()) != -1) {
				fos.write(b);
			}
		}
	}
	

	public static void test1() throws FileNotFoundException, IOException {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("xxx.txt");
			fos = new FileOutputStream("yyy.txt");
			int b;
			while((b = fis.read()) != -1) {
				fos.write(b);
			}
		}finally {
			try {				
				if(fis != null) {
					fis.close();
				}
			}finally {					//try finally的嵌套的作用是能关一个是一个
				if(fos != null) {
					fos.close();				
				}
			}
		}
	}
}

class MyClose implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("我关了");
	}
	
	
}






