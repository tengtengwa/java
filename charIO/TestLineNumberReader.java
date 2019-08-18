package cn.ttw.charIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class TestLineNumberReader {

	public static void main(String[] args) throws IOException {
		LineNumberReader lnr = new LineNumberReader(new FileReader("zzz.txt"));
		
		String line;
		lnr.setLineNumber(100);
		while((line = lnr.readLine()) != null) {
			System.out.println(lnr.getLineNumber() + ":" +line);
		}
		lnr.close();
		
		
		
		
		
	}
}
