package cn.ttw.byteIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImage {

	public static void main(String[] args) throws IOException {
		//Test1();
		//test2();
		
		//test3();
		//����С����ı�׼��ʽ
		FileInputStream fis = new FileInputStream("C:\\Users\\�����޷���İ�ש\\Desktop\\�ļ���\\test.txt");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\�����޷���İ�ש\\Desktop\\copy.txt");
		
		byte[] arr = new byte[1024 * 8];
		int len;
		while((len = fis.read(arr)) != -1) {		//������Ǹ�read��������������������������صľͲ��Ƕ�ȡ���ֽڸ����������ֽڵ����ֵ
			fos.write(arr, 0, len);
		}

		fis.close();
		fos.close();
		
		
		
		
		
		
		
	}

	public static void test3() throws FileNotFoundException, IOException {
		/**
		 *	�����ֿ�����ʽ
		 *	����С����
		 */
		FileInputStream fis = new FileInputStream("C:\\Users\\�����޷���İ�ש\\Desktop\\�ļ���\\test.txt");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\�����޷���İ�ש\\Desktop\\copy.txt");
		
		byte[] arr = new byte[2];
		int len;
		while((len = fis.read(arr)) != -1) {
			fos.write(arr, 0, len);				//???
		}

		fis.close();
		fos.close();
	}

	public static void test2() throws FileNotFoundException, IOException {
		//�������� ���Ƽ����п��ܵ����ڴ����
		FileInputStream fis = new FileInputStream("C:\\Users\\�����޷���İ�ש\\Desktop\\�ļ���\\XMD.zip");	//��������������
		FileOutputStream fos = new FileOutputStream("C:\\Users\\�����޷���İ�ש\\Desktop\\copy.zip");
//		int len = fis.available();
//		System.out.println(len);
		
		byte[] arr = new byte[fis.available()];		//�������ļ���Сһ�����ֽ�����
		fis.read(arr);								//���ļ��е��ֽڶ����ڴ棬���ض�������Ч���ֽڸ���
		fos.write(arr);								//���ļ��е��ֽ�д���ļ�
		
		
		fis.close();
		fos.close();
	}

	//����һ����Ƶ��ͼƬ��ȡд�루���Ƽ���Ч�ʺܵͣ�
	public static void test1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\�����޷���İ�ש\\Desktop\\�羰\\1.jpg");	//��������������
		FileOutputStream fos = new FileOutputStream("C:\\Users\\�����޷���İ�ש\\Desktop\\�羰\\copy.jpg");
		
		int b;
		while((b = fis.read()) != -1) {		//���϶�ȡÿ���ֽ�
			fos.write(b);					//д��ÿ���ֽ�
		}
		fis.close();
		fos.close();
	}
}
