package cn.ttw.charIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TeatFileReader {

	public static void main(String[] args) throws IOException {
		//Test1();
		
		FileReader fr = new FileReader("xxx.txt");
		int c;
		while((c = fr.read()) != -1) {		//ͨ����ĿĬ�ϵ����һ�ζ�ȡһ���ַ�
			System.out.print((char)c);
		}
		fr.close();
		
		
	}

	public static void test1() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("xxx.txt");
		int x = fr.read();
		char c = (char)x;
		System.out.println(c);
		fr.close();
	}
}
