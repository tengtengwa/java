package cn.ttw.exception;

public class TestSThrowable {

	public static void main(String[] args) {
		try {
			System.out.println(1/0);
			
		}catch(Exception e) {
			//System.out.println(e.getMessage());		//��ȡ�쳣��Ϣ
			System.out.println(e);						//����toString��������ӡ�쳣�������쳣��Ϣ
			e.printStackTrace();						//jvmĬ�����ַ�ʽ�����쳣
		}
		
		
		
		
	}
}
