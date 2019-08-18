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
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\�����޷���İ�ש\\Desktop\\�ļ���\\test.txt"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\�����޷���İ�ש\\Desktop\\copy.txt"));
		
		int b;
		while((b = bis.read()) != -1) {
			bos.write(b);
		}
		
		bos.flush();		//�߱�ˢ�µĹ��ܣ�ˢ��֮����Լ���д����close����ˢ�겻���Լ���д
		bis.close();
		bos.close();		//close�����߱�ˢ�µĹ��ܣ��ڹر���֮ǰ������ˢ��һ�λ������������������ֽ�ȫ��ˢ�µ��ļ��У��ٹر�
		
	}

	public static void test1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\�����޷���İ�ש\\Desktop\\�ļ���\\test.txt");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\�����޷���İ�ש\\Desktop\\copy.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
//		BufferedInputStream bis1 = new BufferedInputStream(new FileInputStream("C:\\Users\\�����޷���İ�ש\\Desktop\\�ļ���\\test.txt"));
//		BufferedOutputStream bos1 = new BufferedOutputStream(new FileOutputStream("C:\\Users\\�����޷���İ�ש\\Desktop\\copy.txt"));
		
		
		int b;
		while((b = bis.read()) != -1) {
			bos.write(b);
		}
		bis.close();
		bos.close();
	}
}
