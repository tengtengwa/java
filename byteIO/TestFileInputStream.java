package cn.ttw.byteIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *	 �����ֽ�������
 * 
 * read()������ȡ����һ���ַ���Ϊʲô����ֵ��int��������byte
 * 		����11111111ʱ��byte���͵�ֵΪ-1����int���ͻ���ǰ���Զ���8*3��0��ֵΪ255
 * 		��ֹ������Ҫ����ֵȴ����ֹͣ�����
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
		int x = fis.read();			//��Ӳ���϶�ȡһ���ֽ�
		int y = fis.read();
		System.out.println(x);
		System.out.println(y);
		fis.close();				//�����ͷ���Դ
	}
}
