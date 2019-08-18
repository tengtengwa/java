package cn.ttw.unit5_1;
/**
 * 
 * ²âÊÔStringBuild,StringBuffer¿É±ä×Ö·ûĞòÁĞ
 * @author ÌÚÌÚÍŞ
 *
 */


public class TestStringBuild {
	public static void main(String[] args) {
		StringBuilder s = new StringBuilder();
		for(int i=0;i<26;i++) {
			char tem = (char)('a'+i);
			s.append(tem);
		}
		
		System.out.println(s);
		s.reverse();				//µ¹Ğò
		System.out.println(s);
		s.setCharAt(0, 'ÌÚ');		//Ìæ»»Ö¸¶¨×Ö·û
		System.out.println(s);
		s.insert(26, 'ÌÚ');			//²åÈë×Ö·û
		System.out.println(s);
		s.delete(1, 26);			//É¾³ı×Ö·û´®£¨Çø¼ä£©
		System.out.println(s);
	}
}
