package cn.ttw.diguiTest;

import java.io.*;

/**
 * ���̽��������ļ���·����������һ���ļ����У��������ݣ���������һ���ļ�����
 *
 */

public class Test3 {
    public static void main(String[] args) throws IOException {
        File src = Test1.getDir();
        File dest = Test1.getDir();
        if(src.equals(dest)){
            System.out.println("Ŀ���ļ�����Դ�ļ��е����ļ���");
        }else{
            copy(src,dest);
        }


    }

    public static void copy(File src, File dest) throws IOException{
        //��Ŀ���ļ���(dest)�д���Դ�ļ���(���ļ���)
        File newDir = new File(dest,src.getName());
        newDir.mkdir();
        //��ȡԴ�ļ����������ļ����ļ��У�������File������
        File[] subFiles = src.listFiles();
        //��������
        for (File subFile : subFiles
             ) {
            if(subFile.isFile()){
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(subFile));
                BufferedOutputStream bos =
                        new BufferedOutputStream(new FileOutputStream(new File(newDir,subFile.getName())));
                int b;
                while ((b = bis.read()) != -1){
                    bos.write(b);
                }
                bis.close();
                bos.close();
            }else{
                copy(subFile,newDir);           //���ļ��У��͵ݹ����
            }
        }

    }
}
