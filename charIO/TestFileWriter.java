package cn.ttw.charIO;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("yyy.txt");
		fw.write("��������е�Ʈ����������Գ���rap��");
		fw.write(97);
		fw.close();
		
		
		
		
	}
}
