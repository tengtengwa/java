package cn.ttw.unit5_1;
/**
 * 
 * ����StringBuild,StringBuffer�ɱ��ַ�����
 * @author ������
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
		s.reverse();				//����
		System.out.println(s);
		s.setCharAt(0, '��');		//�滻ָ���ַ�
		System.out.println(s);
		s.insert(26, '��');			//�����ַ�
		System.out.println(s);
		s.delete(1, 26);			//ɾ���ַ��������䣩
		System.out.println(s);
	}
}
