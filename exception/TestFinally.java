package cn.ttw.exception;

/**
 * 	finally���ص�
 * 		��finally���Ƶ������һ����ִ��
 * 		�����������ִ�е�finallyǰjvm�˳��ˣ���System.exit(0)��
 * 	finally�����ã�
 * 		�����ͷ���Դ����IO�����������ݿ�����л����
 * 	return���ִ�к�ῴһ����û��finally��䣬����оͽ�finallyִ�к��ٳ��׷���
 * 
 */

public class TestFinally {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}catch(Exception e) {
			System.out.println("����Ϊ����");
			System.exit(0);			//�˳�jvm�����
			return;
		}finally {
			System.out.println("����ִ����ô");
		}
		
		
	}
}
