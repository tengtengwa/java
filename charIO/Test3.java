package cn.ttw.charIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * ���ð������
 * 	ÿִ��һ���������ǻ��ж��ٴ�ʹ�û��ᣬ����10�λ��ᣬִ��һ����ʾһ�λ�ʣ���λ��ᣬ�������������ʾ�빺������
 * ������
 * 	1.�����������������������ΪҪʹ��readline���������Ա�֤���ݲ���
 * 	2.���������ַ�ת��Ϊint��
 * 	3.��int�������жϣ��������0��--��д��ȥ��������ʾ�빺������
 * 	4.��if�ж���Ҫ��--��Ľ����ӡ���������ͨ�������д���ļ�
 * 
 */


public class Test3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("config.txt"));
		String line = br.readLine();
		int times = Integer.parseInt(line);
		if(times > 0) {
			System.out.println("������" + times-- + "�λ���");
			FileWriter fw = new FileWriter("config.txt");
			fw.write(times + "");
			fw.close();
		}else {
			System.out.println("��ƣ������û��������ˣ��Ͻ�������");
		}
		
	}
}










