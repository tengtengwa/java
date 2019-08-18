package cn.ttw.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestGetMethod {

	public static void main(String[] args) {
		//Test1();
		File dir = new File("C:\\Users\\�����޷���İ�ש\\Desktop\\app");
		String[] arr = dir.list();				//��ȡ��Ŀ¼�������ļ�����
		for (String string : arr) {
			System.out.println(string);
		}
		
		File[] subFiles = dir.listFiles();		//��ȡ��Ŀ¼������file����
		for (File file : subFiles) {
			System.out.println(file);
		}
		
		
		
	}

	public static void test1() {
		File file1 = new File("xxx.txt");
		File file2 = new File("C:\\Users\\�����޷���İ�ש\\Desktop\\JAVA\\��ѧJava\\xxx.txt");
//		System.out.println(file1.getAbsolutePath());		//��ȡ����·��
//		System.out.println(file2.getAbsolutePath());
		
//		System.out.println(file1.getPath());		//��ȡ���췽���д����·��
//		System.out.println(file2.getPath());
//		
//		System.out.println(file1.getName());		//��ȡ�ļ����ļ��е�����
//		System.out.println(file2.getName());
//		
//		System.out.println(file1.length());		//��ȡ�ļ����ݳ��ȣ��ֽ�����
		
		System.out.println(file1.lastModified());	//�ļ�����޸�ʱ��
		Date d = new Date(file1.lastModified());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		System.out.println(sdf.format(d));
	}
}
