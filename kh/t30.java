package cn.ttw.kh;

import cn.ttw.charIO.Copy;

import java.io.*;
import java.util.Scanner;

public class t30 {
    public static void main(String[] args) throws IOException {
        System.out.println("����Դ�ļ�·����");
        File src = getDir();
        System.out.println("����Ŀ���ļ�·����");
        File dest = getDir();
        if(src.equals(dest)){
            System.out.println("Ŀ���ļ�����Դ�ļ��еĵ����ļ���");
        }else{
            copy(src,dest);
        }
        //�������ļ�
        String str  = dest.getName() + "-����";
        File rename = new File(str);
        dest.renameTo(rename);

    }

    public static File getDir(){
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        File dir = new File(path);
        return dir;
    }

    public static void copy(File src,File dest) throws IOException{
        File newDir = new File(dest,src.getName());
        newDir.mkdir();
        File[] subFiles = src.listFiles();

        for (File subFile : subFiles) {
            if(subFile.isFile()){
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(subFile));
                BufferedOutputStream bos =
                        new BufferedOutputStream(new FileOutputStream(new File(newDir,subFile.getName())));
                int b;
                while((b = bis.read()) != -1){
                    bos.write(b);
                }
                bis.close();
                bos.close();

            }else {
                copy(subFile,newDir);
            }

        }

    }

}
