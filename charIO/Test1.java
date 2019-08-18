package cn.ttw.charIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * ����һ���ı��е����ݷ�ת������һ�к͵�����һ�н��������ڶ��к͵����ڶ��н���
 *
 *	���裺
 *	1.���������������
 *	2.�������϶���
 *	3.�����������ݴ����ڼ�����
 *	4.���ű������ϣ�������д���ļ�
 *	5.����
 *
 *	ע������������������
 */

public class Test1 {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new FileReader("xxx.txt"));
    	ArrayList<String> list = new ArrayList<String>();
    	String line;
    	while((line = br.readLine()) != null) {
    		list.add(line);
    	}
    	
    	br.close();
    	BufferedWriter bw = new BufferedWriter(new FileWriter("yyy.txt"));
    	for(int i = list.size()-1; i >= 0; i--) {
    		bw.write(list.get(i));
    		bw.newLine();
    	}
    	bw.close();
    	
    	
    }
}
