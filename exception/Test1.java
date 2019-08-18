package cn.ttw.exception;

/**
 *	final,finally,finalize������
 * 		final�����������࣬���ܱ��̳У� ���η��������ܱ���д�� ���α�����ֻ�ܸ���һ�Σ�
 * 		finally��try����е�һ������壬���ܵ���ʹ�ã������ͷ���Դ
 * 		finalize��������������ȷ�������ڶԸö���ĸ�������ʱ���ɶ�����������������ô˷���
 * 	
 *	���catch������return��䣬��ôfinally�Ĵ��뻹��ִ��������ᣬ��������returnǰ����return��
 * 		����ִ�У���return���׷���ǰ
 * 
 */

public class Test1 {

	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println(d.method());
	}
}

class Demo{
	public int method() {
		int x = 10;
		try {
			x = 20;
			System.out.println(1/0);
			return x;
		}catch(Exception e) {
			x = 30;
			return x;			
		}finally {
			x = 40;
			//return x;		//��Ҫ��finally�����д�������
		}

		
	}
	
}