package cn.ttw.byteIO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * ����¼���ļ�·���������ļ�����������
 * 
 * 
 */

public class Test2 {

	public static void main(String[] args) throws IOException {
		File file = getFile();
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\�����޷���İ�ש\\Desktop\\copy2.jpg"));
		
		int b;
		while((b = bis.read()) != -1) {
			bos.write(b);
		}
		bis.close();
		bos.close();
		
	}
	public static File getFile() {
		Scanner sc = new Scanner(System.in);
		System.out.println("����һ���ļ�·��:");
		while(true) {
			String path = sc.nextLine();
			File file = new File(path);
			if(!file.exists()) {
				System.out.println("¼����ļ�·�������ڣ�����������");
			}else if(file.isDirectory()) {
				System.out.println("¼�����ļ���·��������������");
			}else {
				return file;
			}
		}
		
	}
	
}
