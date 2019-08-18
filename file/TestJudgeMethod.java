package cn.ttw.file;

import java.io.File;

public class TestJudgeMethod {

	public static void main(String[] args) {
		File dir1 = new File("ccc");
		System.out.println(dir1.isDirectory());	//判断是否是目录（文件夹）
		
		File dir2 = new File("zzz");
		System.out.println(dir2.isFile());		//判断是否是文件
		
		//public boolean setReadable():		//设置是否可读（Windows认为所有文件可读）
		//public boolean setWritable():		//windows系统可以设置为不可写
		//public boolean canRead():
		//public boolean canWrite():
		//public boolean canisHidden():
		
		
		
		
	}
}
