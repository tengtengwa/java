package cn.ttw.file;

import java.io.File;

public class TestJudgeMethod {

	public static void main(String[] args) {
		File dir1 = new File("ccc");
		System.out.println(dir1.isDirectory());	//�ж��Ƿ���Ŀ¼���ļ��У�
		
		File dir2 = new File("zzz");
		System.out.println(dir2.isFile());		//�ж��Ƿ����ļ�
		
		//public boolean setReadable():		//�����Ƿ�ɶ���Windows��Ϊ�����ļ��ɶ���
		//public boolean setWritable():		//windowsϵͳ��������Ϊ����д
		//public boolean canRead():
		//public boolean canWrite():
		//public boolean canisHidden():
		
		
		
		
	}
}
