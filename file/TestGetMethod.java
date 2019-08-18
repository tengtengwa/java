package cn.ttw.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestGetMethod {

	public static void main(String[] args) {
		//Test1();
		File dir = new File("C:\\Users\\腾腾娃发光的板砖\\Desktop\\app");
		String[] arr = dir.list();				//获取此目录下所有文件名称
		for (String string : arr) {
			System.out.println(string);
		}
		
		File[] subFiles = dir.listFiles();		//获取此目录下所有file对象
		for (File file : subFiles) {
			System.out.println(file);
		}
		
		
		
	}

	public static void test1() {
		File file1 = new File("xxx.txt");
		File file2 = new File("C:\\Users\\腾腾娃发光的板砖\\Desktop\\JAVA\\初学Java\\xxx.txt");
//		System.out.println(file1.getAbsolutePath());		//获取绝对路径
//		System.out.println(file2.getAbsolutePath());
		
//		System.out.println(file1.getPath());		//获取构造方法中传入的路径
//		System.out.println(file2.getPath());
//		
//		System.out.println(file1.getName());		//获取文件或文件夹的名称
//		System.out.println(file2.getName());
//		
//		System.out.println(file1.length());		//获取文件内容长度（字节数）
		
		System.out.println(file1.lastModified());	//文件最后修改时间
		Date d = new Date(file1.lastModified());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		System.out.println(sdf.format(d));
	}
}
