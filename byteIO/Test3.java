package cn.ttw.byteIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * ������¼������ݿ����������text.txt�ļ��У�������¼��quitʱ�˳�
 * 
 * ���裺
 * 	1.��������¼�����
 * 	2.������������󣬹���test.txt�ļ�
 * 	3.��������ѭ��
 * 	4.����quitʱ�˳�
 * 	5.�粻quit���ͽ�����д��
 * 	6.�ر���
 * 
 * 
 * 
 */

public class Test3 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		FileOutputStream fos = new FileOutputStream("C:\\Users\\�����޷���İ�ש\\Desktop\\text.txt");
		while(true) {
			String line = sc.nextLine();
			if("quit".equals(line)) {
				break;
			}else {
				fos.write(line.getBytes());
				fos.write("\r\n".getBytes());	//Java��windowsϵͳ�л�����Ҫ\r\n
			}
		}
		fos.close();
		
		
		
		
		
		
	}
}
