package cn.ttw.unit5_1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * 测试DateFormat
 * @author 腾腾娃发光的板砖
 *
 */

public class TestDateFormat {
	public static void main(String[] args) throws ParseException {
		//把时间对象按照指定格式转换成字符串
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String str = df.format(new Date());
		System.out.println(str);
		
		//把字符串按照指定格式转换为时间对象
		DateFormat df2 = new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒");
		Date date = df2.parse("2019年5月18日 16时25分06秒");
		System.out.println(date);
		
	}
}
