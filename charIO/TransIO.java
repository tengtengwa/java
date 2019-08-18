package cn.ttw.charIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class TransIO {

	public static void main(String[] args) throws IOException {
		//test1();
		//test2();

		BufferedReader br = 							//����Ч�ض�
				new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\�����޷���İ�ש\\Desktop\\JAVA\\��ѧJava\\src\\utf-8.txt"), "UTF-8"));
		BufferedWriter bw = 							//����Ч��д
				new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\�����޷���İ�ש\\Desktop\\JAVA\\��ѧJava\\src\\gbk.txt"), "gbk"));
		
		int c;
		while((c = br.read()) != -1) {
			bw.write(c);
		}
		
		br.close();
		bw.close();
		
	}

	public static void test2() throws UnsupportedEncodingException, FileNotFoundException, IOException {
		InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\Users\\�����޷���İ�ש\\Desktop\\JAVA\\��ѧJava\\src\\utf-8.txt"), "UTF-8");		//ָ�������ַ�
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("C:\\Users\\�����޷���İ�ש\\Desktop\\JAVA\\��ѧJava\\src\\gbk.txt"), "gbk");		//ָ�����д�ַ�
		
		int c;
		while((c = isr.read()) != -1) {
			osw.write(c);
		}
		
		isr.close();
		osw.close();
	}

	public static void test1() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("C:\\Users\\�����޷���İ�ש\\Desktop\\JAVA\\��ѧJava\\src\\utf-8.txt");
		FileWriter fw = new FileWriter("C:\\Users\\�����޷���İ�ש\\Desktop\\JAVA\\��ѧJava\\src\\gbk.txt");
		
		int c;
		while((c = fr.read()) != -1) {
			fw.write(c);
		}
		
		fr.close();
		fw.close();
	}
}
