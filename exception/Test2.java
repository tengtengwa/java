package cn.ttw.exception;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * 	��ϰ��
 * 		����¼��һ��int��������������������
 * 		���¼����������󣬸�����ʾ����������
 * 		���¼�����С����������ʾ����������
 * 		���¼����������ַ���������ʾ����������
 */

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��������");
		while(true) {
			String line = sc.nextLine();
			try {
				int num = Integer.parseInt(line);
				System.out.println(Integer.toBinaryString(num));	//������ת��Ϊ������
				break;
			}catch(Exception e) {
				try {
					new BigInteger(line);
					System.out.println("����¼��������������������");
				}catch(Exception e2) {
					try {
						new BigDecimal(line);
						System.out.println("����¼���˸�����������������");
					} catch (Exception e1) {								//alt + shitf + z��try catch��ݼ�
						System.out.println("����¼���˷Ƿ��ַ�������������");
					}
				}
			}			
		}

		
		
		
	}
}
