package cn.ttw.file;

import java.io.File;

public class TestFileRameAndDelete {

	public static void main(String[] args) {
		//Test1();
		File file1 = new File("C:\\Users\\腾腾娃发光的板砖\\Desktop\\ooo.txt");
		System.out.println(file1.delete());		//Java中删除不走回收站
		
		File file2 = new File("aaa");
		System.out.println(file2.delete());		//删除文件夹时，注意该文件夹内不能包含文件或文件夹
		
		
		
	}

	public static void test1() {
		File file1 = new File("C:\\Users\\腾腾娃发光的板砖\\Desktop\\file.txt");
		File file2 = new File("C:\\Users\\腾腾娃发光的板砖\\Desktop\\ooo.txt");
		file1.renameTo(file2);		//如果路径相同就是改名，否则改名并剪切
	}
}
