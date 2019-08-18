package cn.ttw.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


/**
 * Test1~3测试以下方法：
 * 	File(String pathname):根据一个路径得到File对象
 * 	File(String parent, String chile):根据一个目录和一个子文件/目录得到File对象
 * 	File(File parent, String child):根据一个父File对象和一个子文件/目录得到File对象
 * 
 * test4~5测试以下方法:
 * 	public boolean createNewFile():创建文件，如果存在该文件就创建，否则不创建
 * 	public boolean mkdir():创建文件夹，如果存在就创建，否则不创建
 * 	public boolean mkdirs()：创建文件夹，如果父文件夹不存在，会帮你创建
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
		System.out.println(file.createNewFile());	//如果存在该文件就创建，否则不创建
		
		File file2 = new File("zzz");		//文件夹也可以有后缀
		System.out.println(file2.createNewFile());
		
		File file3 = new File("ccc\\ddd");
		System.out.println(file3.mkdirs());		//创建多级目录
		
	}

	public static void test3() {
		File parent = new File("C:\\Users\\腾腾娃发光的板砖\\Desktop");
		String child = "file.txt";
		File file = new File(parent, child);
		System.out.println(file.exists());
		System.out.println(parent.exists());
	}

	public static void test2() {
		String parent = "C:\\Users\\腾腾娃发光的板砖\\Desktop";
		String child = "file.txt";
		File file = new File(parent,child);
		System.out.println(file.exists());
	}

	public static void test1() {
		File file = new File("C:\\Users\\腾腾娃发光的板砖\\Desktop\\file.txt");
		System.out.println(file.exists());
		
		File file2 = new File("xxx.txt");
		System.out.println(file2.exists());
	}
}
