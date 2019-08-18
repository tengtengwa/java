package cn.ttw.charIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class TransIO {

	public static void main(String[] args) throws IOException {
		//test1();
		//test2();

		BufferedReader br = 							//更高效地读
				new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\腾腾娃发光的板砖\\Desktop\\JAVA\\初学Java\\src\\utf-8.txt"), "UTF-8"));
		BufferedWriter bw = 							//更高效地写
				new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\腾腾娃发光的板砖\\Desktop\\JAVA\\初学Java\\src\\gbk.txt"), "gbk"));
		
		int c;
		while((c = br.read()) != -1) {
			bw.write(c);
		}
		
		br.close();
		bw.close();
		
	}

	public static void test2() throws UnsupportedEncodingException, FileNotFoundException, IOException {
		InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\Users\\腾腾娃发光的板砖\\Desktop\\JAVA\\初学Java\\src\\utf-8.txt"), "UTF-8");		//指定码表读字符
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("C:\\Users\\腾腾娃发光的板砖\\Desktop\\JAVA\\初学Java\\src\\gbk.txt"), "gbk");		//指定码表写字符
		
		int c;
		while((c = isr.read()) != -1) {
			osw.write(c);
		}
		
		isr.close();
		osw.close();
	}

	public static void test1() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("C:\\Users\\腾腾娃发光的板砖\\Desktop\\JAVA\\初学Java\\src\\utf-8.txt");
		FileWriter fw = new FileWriter("C:\\Users\\腾腾娃发光的板砖\\Desktop\\JAVA\\初学Java\\src\\gbk.txt");
		
		int c;
		while((c = fr.read()) != -1) {
			fw.write(c);
		}
		
		fr.close();
		fw.close();
	}
}
