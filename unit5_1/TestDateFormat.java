package cn.ttw.unit5_1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * ����DateFormat
 * @author �����޷���İ�ש
 *
 */

public class TestDateFormat {
	public static void main(String[] args) throws ParseException {
		//��ʱ�������ָ����ʽת�����ַ���
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String str = df.format(new Date());
		System.out.println(str);
		
		//���ַ�������ָ����ʽת��Ϊʱ�����
		DateFormat df2 = new SimpleDateFormat("yyyy��MM��dd�� hhʱmm��ss��");
		Date date = df2.parse("2019��5��18�� 16ʱ25��06��");
		System.out.println(date);
		
	}
}
