package cn.ttw.charIO;
import	java.io.BufferedWriter;
import	java.io.BufferedReader;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 什么情况下使用字符流？
 *		字符流也可以拷贝文本文件，但不推荐使用，因为读取时会把字节转为字符，写出时还要把字符转为字节
 *		*程序只读或只写一段文本时可以使用字符流
 *		字符流读取时按照字符大小读取，不会出现半个中文字符；写出时可以直接将字符串写出，不用转换为字节数组
 * 
 * 字符流是否可以拷贝非纯文本文件？
 * 		不可以，因为在读的时候会将字节转换为字符，在转换过程中可能找不到对应的字符，就会用？代替，写出时会将字符转换成字节写出
 * 		如果是？，直接写出，这样写出后文件就无法查看
 * 
 */

public class Copy {

	public static void main(String[] args) throws IOException {
		//Test1();
		//test2();

		BufferedReader br = new BufferedReader(new FileReader("xxx.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("yyy.txt"));

		int c;
		while((c = br.read()) != -1){
			bw.write(c);
		}
		br.close();
		bw.close();
	}

	public static void test2() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("xxx.txt");
		FileWriter fw = new FileWriter("yyy.txt");
		
		char[] arr = new char[1024];
		int len;
		while((len = fr.read(arr)) != -1) {
			fw.write(arr, 0, len);
		}
		
		fr.close();
		fw.close();
	}


	public static void test1() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("xxx.txt");
		FileWriter fw = new FileWriter("yyy.txt");
		int c;
		while((c = fr.read()) != -1) {
			fw.write(c);
		}
		fr.close();
		fw.close();		//Writer类中有一个2k的小缓冲区，如不关流，会将内容写到缓冲区，关流会将缓冲区内的内容写入文件
	}
}

