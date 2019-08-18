package cn.ttw.charIO;
import	java.io.BufferedWriter;
import	java.io.BufferedReader;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * ʲô�����ʹ���ַ�����
 *		�ַ���Ҳ���Կ����ı��ļ��������Ƽ�ʹ�ã���Ϊ��ȡʱ����ֽ�תΪ�ַ���д��ʱ��Ҫ���ַ�תΪ�ֽ�
 *		*����ֻ����ֻдһ���ı�ʱ����ʹ���ַ���
 *		�ַ�����ȡʱ�����ַ���С��ȡ��������ְ�������ַ���д��ʱ����ֱ�ӽ��ַ���д��������ת��Ϊ�ֽ�����
 * 
 * �ַ����Ƿ���Կ����Ǵ��ı��ļ���
 * 		�����ԣ���Ϊ�ڶ���ʱ��Ὣ�ֽ�ת��Ϊ�ַ�����ת�������п����Ҳ�����Ӧ���ַ����ͻ��ã����棬д��ʱ�Ὣ�ַ�ת�����ֽ�д��
 * 		����ǣ���ֱ��д��������д�����ļ����޷��鿴
 * 
 */

public class Copy {

	public static void main(String[] args) throws IOException {
		//Test1();
		//test2();

		BufferedReader br = new BufferedReader(new FileReader("xxx.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("yyy.txt"));

		int c;
		while((c = br.read()) != -1){
			bw.write(c);
		}
		br.close();
		bw.close();
	}

	public static void test2() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("xxx.txt");
		FileWriter fw = new FileWriter("yyy.txt");
		
		char[] arr = new char[1024];
		int len;
		while((len = fr.read(arr)) != -1) {
			fw.write(arr, 0, len);
		}
		
		fr.close();
		fw.close();
	}


	public static void test1() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("xxx.txt");
		FileWriter fw = new FileWriter("yyy.txt");
		int c;
		while((c = fr.read()) != -1) {
			fw.write(c);
		}
		fr.close();
		fw.close();		//Writer������һ��2k��С���������粻�������Ὣ����д���������������Ὣ�������ڵ�����д���ļ�
	}
}

