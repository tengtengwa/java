package cn.ttw.diguiTest;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * �Ӽ��̽���һ���ļ���·����ͳ�Ƹ��ļ��д�С (���ļ����������ļ��Ĵ�С)
 *
 */

public class Test1 {
    public static void main(String[] args) throws IOException {
        File dir = getDir();
        System.out.println(getFileLength(dir));


    }

    //�Ӽ��̽���һ���ļ���·��
    public static File getDir(){
        //������������
        Scanner sc = new Scanner(System.in);
        System.out.println("����һ���ļ���·��");

        //��������ѭ��
        while (true){
            String line = sc.nextLine();
            File dir = new File(line);
            //������루��Ч·�����ļ�·���������
            if(!dir.exists()){
                System.out.println("��������ļ�·�������ڣ�����������");
            }else if (dir.isFile()){
                System.out.println("�������ļ�·��������������");
            }else{
                return dir;
            }
        }
    }

    //ͳ�Ƹ��ļ��д�С
    public static long getFileLength(File dir){     //����ֵ����Ϊlong�������б�ΪFile dir
        //����һ����ͱ���
        long len = 0;
        //��ȡ���ļ���·���������ļ����ļ��У�listFiles()������
        File[] subFiles = dir.listFiles();
        //��������
        for (File subFile : subFiles
             ) {
            //���ļ������
            if(subFile.isFile()){
                len += subFile.length();
            }else{          //���ļ��о͵ݹ����
                len += getFileLength(subFile);
            }
        }

        return len;
    }



}
