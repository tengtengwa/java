package cn.ttw.byteIO;

/**
 *	 �����ֽ������
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutStream {

	public static void main(String[] args) throws IOException {
		//Test1();
		FileOutputStream fos = new FileOutputStream("yyy.txt",true);	//����д�͵����乹�췽�������ڶ�����������true
		fos.write(97);
		fos.write(98);
		
		fos.close();
		
		
	}

	public static void test1() throws FileNotFoundException, IOException {
		FileOutputStream fos = new FileOutputStream("yyy.txt");		//�����ֽ�������������û�о��Զ�����һ��������д��ļ����Ὣ�ļ������
		
//		fos.write(97);		//��Ȼд������һ��int���������ļ�����һ���ֽڣ����Զ�ȥ��ǰ���3��8λ
//		fos.write(98);
//		fos.write(99);
		fos.write(100);
		
		
		fos.close();
	}
}
