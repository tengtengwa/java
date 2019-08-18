package cn.ttw.file;

import java.io.File;
import java.io.FilenameFilter;

/**
 * 输出指定目录下指定后缀名的文件
 * 
 * 
 */

public class Test1 {

	public static void main(String[] args) {
		File dir = new File("C:\\Users\\腾腾娃发光的板砖\\Desktop\\风景");
		
//		String[] arr = dir.list();		//获取此目录下所有文件/文件夹
//		for (String string : arr) {
//			if(string.endsWith(".jpg")) {
//				System.out.println(string);
//			}
//		}
		
//		File[] subFiles = dir.listFiles();		//获取此目录下所有文件（夹）对象
//		for (File file : subFiles) {
//			if(file.isFile() && file.getName().endsWith(".jpg")) {
//				System.out.println(file);
//			}
//		}
		
		
		String[] arr = dir.list(new FilenameFilter() {	//过滤器底层用list集合实现
			
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
