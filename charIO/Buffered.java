package cn.ttw.charIO;
import	java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * �������������е����ⷽ��: readLine() newLine()
 *	BufferedReadLine����readLine()����	BufferedWriter����newLine()����
 *
 *newLine()��\r\n������
 *	newLine()�ǿ�ƽ̨�ķ���
 *	\r\nֻ֧��Windowsϵͳ
 *
 */

public class Buffered {
    public static void main(String[] args) throws IOException {
		//Test1();

		BufferedReader br = new BufferedReader(new FileReader("zzz.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("xxx.txt"));
		String line;
    	while((line = br.readLine()) != null) {
    		bw.write(line);
    		bw.newLine();		//д���س����з�
    	}
    	
    	br.close();
    	bw.close();
    	
    }

	public static void test1() throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("zzz.txt"));
        String line;

        while((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();
	}
}
