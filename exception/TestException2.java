package cn.ttw.exception;

/**
 * Java���쳣��Ϊ�����ࣺ����ʱ�쳣������ʱ�쳣
 * 	����ʱ�쳣��������ʾ�����������������޷�ͨ������
 * 	����ʱ�쳣��������ʾ����Ҳ���Ժͱ���ʱ�쳣һ������
 * 
 * 
 */

import java.io.FileInputStream;

public class TestException2 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("xxx.txt");			
		}catch(Exception e) {
			
		}
		

		
		
		
	}
}
