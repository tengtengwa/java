package cn.ttw.file;

import java.io.File;
import java.io.FilenameFilter;

/**
 * ���ָ��Ŀ¼��ָ����׺�����ļ�
 * 
 * 
 */

public class Test1 {

	public static void main(String[] args) {
		File dir = new File("C:\\Users\\�����޷���İ�ש\\Desktop\\�羰");
		
//		String[] arr = dir.list();		//��ȡ��Ŀ¼�������ļ�/�ļ���
//		for (String string : arr) {
//			if(string.endsWith(".jpg")) {
//				System.out.println(string);
//			}
//		}
		
//		File[] subFiles = dir.listFiles();		//��ȡ��Ŀ¼�������ļ����У�����
//		for (File file : subFiles) {
//			if(file.isFile() && file.getName().endsWith(".jpg")) {
//				System.out.println(file);
//			}
//		}
		
		
		String[] arr = dir.list(new FilenameFilter() {	//�������ײ���list����ʵ��
			
			@Override
			public boolean accept(File dir, String name) {
				File file = new File(dir, name);
				return file.isFile() && file.getName().endsWith(".txt");
			}
		});
		
		for (String string : arr) {
			System.out.println(string);
		}
		
		
		
		
		
		
		
	}
}
