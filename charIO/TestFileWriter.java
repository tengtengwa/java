package cn.ttw.charIO;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("yyy.txt");
		fw.write("你家坤坤有点飘，他最近沉迷唱跳rap。");
		fw.write(97);
		fw.close();
		
		
		
		
	}
}
