package cn.ttw.file;

import java.io.File;

public class TestFileRameAndDelete {

	public static void main(String[] args) {
		//Test1();
		File file1 = new File("C:\\Users\\�����޷���İ�ש\\Desktop\\ooo.txt");
		System.out.println(file1.delete());		//Java��ɾ�����߻���վ
		
		File file2 = new File("aaa");
		System.out.println(file2.delete());		//ɾ���ļ���ʱ��ע����ļ����ڲ��ܰ����ļ����ļ���
		
		
		
	}

	public static void test1() {
		File file1 = new File("C:\\Users\\�����޷���İ�ש\\Desktop\\file.txt");
		File file2 = new File("C:\\Users\\�����޷���İ�ש\\Desktop\\ooo.txt");
		file1.renameTo(file2);		//���·����ͬ���Ǹ������������������
	}
}
