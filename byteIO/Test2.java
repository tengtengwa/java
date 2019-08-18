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
 * 键盘录入文件路径，将该文件拷贝到桌面
 * 
 * 
 */

public class Test2 {

	public static void main(String[] args) throws IOException {
		File file = getFile();
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\腾腾娃发光的板砖\\Desktop\\copy2.jpg"));
		
		int b;
		while((b = bis.read()) != -1) {
			bos.write(b);
		}
		bis.close();
		bos.close();
		
	}
	public static File getFile() {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个文件路径:");
		while(true) {
			String path = sc.nextLine();
			File file = new File(path);
			if(!file.exists()) {
				System.out.println("录入的文件路径不存在，请重新输入");
			}else if(file.isDirectory()) {
				System.out.println("录入了文件夹路径，请重新输入");
			}else {
				return file;
			}
		}
		
	}
	
}
