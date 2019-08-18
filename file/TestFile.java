package cn.ttw.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


/**
 * Test1~3�������·�����
 * 	File(String pathname):����һ��·���õ�File����
 * 	File(String parent, String chile):����һ��Ŀ¼��һ�����ļ�/Ŀ¼�õ�File����
 * 	File(File parent, String child):����һ����File�����һ�����ļ�/Ŀ¼�õ�File����
 * 
 * test4~5�������·���:
 * 	public boolean createNewFile():�����ļ���������ڸ��ļ��ʹ��������򲻴���
 * 	public boolean mkdir():�����ļ��У�������ھʹ��������򲻴���
 * 	public boolean mkdirs()�������ļ��У�������ļ��в����ڣ�����㴴��
 */


public class TestFile {

	public static void main(String[] args) throws IOException {
		//test1();
		//test2();
		//test3();
		//test4();
		test5();
		
		
	}

	public static void test5() {
		File dir1 = new File("aaa");
		System.out.println(dir1.mkdir());
		
		File dir2 = new File("bbb.txt");
		System.out.println(dir2.mkdir());
	}

	public static void test4() throws IOException {
		File file = new File("yyy.txt");
		System.out.println(file.createNewFile());	//������ڸ��ļ��ʹ��������򲻴���
		
		File file2 = new File("zzz");		//�ļ���Ҳ�����к�׺
		System.out.println(file2.createNewFile());
		
		File file3 = new File("ccc\\ddd");
		System.out.println(file3.mkdirs());		//�����༶Ŀ¼
		
	}

	public static void test3() {
		File parent = new File("C:\\Users\\�����޷���İ�ש\\Desktop");
		String child = "file.txt";
		File file = new File(parent, child);
		System.out.println(file.exists());
		System.out.println(parent.exists());
	}

	public static void test2() {
		String parent = "C:\\Users\\�����޷���İ�ש\\Desktop";
		String child = "file.txt";
		File file = new File(parent,child);
		System.out.println(file.exists());
	}

	public static void test1() {
		File file = new File("C:\\Users\\�����޷���İ�ש\\Desktop\\file.txt");
		System.out.println(file.exists());
		
		File file2 = new File("xxx.txt");
		System.out.println(file2.exists());
	}
}
