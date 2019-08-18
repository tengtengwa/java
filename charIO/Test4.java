package cn.ttw.charIO;
import	java.lang.reflect.Field;
import	java.util.Scanner;
import	java.io.File;
import	java.util.Map;

/**
 * Ҫ�󣺴Ӽ����������һ���ļ���·������ӡ���ļ��������е�.java�ļ���
 *
 * ������
 *  ���գ����¼�벻���ڵ��ļ���·����������/�ļ�·������������ʾ
 *  ��ӡ��
 *      1.��ȡ���ļ���·���������ļ����ļ��У�������File������
 *      2.�������飬��ÿһ���ļ����ļ������ж�
 *      3.�����.java�ļ��ʹ�ӡ��������ļ��о͵ݹ����
 *
 *
 */

public class Test4 {
    public static void main(String[] args) {
        File dir = getDir();
        printJavaFile(dir);


    }

    public static File getDir() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("������һ���ļ���·����");
        while (true){
            String line = scanner.nextLine();
            File dir = new File(line);
            if(!dir.exists()){
                System.out.println("��¼����ļ���·�������ڣ�����������");
            }else if(dir.isFile()){
                System.out.println("��¼������ļ�·��������������");
            }else{
                return dir;
            }
        }
    }

    //��ȡ�ļ���·��������.java�ļ�
    public static void printJavaFile(File dir) {
        //1.��ȡ���ļ���·���������ļ����ļ��У�������File������
        File[] subFiles = dir.listFiles();
        //2.�������飬��ÿһ���ļ����ļ��н����ж�
        for (File subFile : subFiles) {
            //3.�����.java�ļ���ֱ�Ӵ�ӡ
            if(subFile.isFile() && subFile.getName().endsWith(".java")){
                System.out.println(subFile);
            }else if(dir.isDirectory()){        //��Ŀ¼�͵ݹ����
                printJavaFile(subFile);
            }
        }

    }


}











