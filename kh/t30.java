package cn.ttw.kh;

import cn.ttw.charIO.Copy;

import java.io.*;
import java.util.Scanner;

public class t30 {
    public static void main(String[] args) throws IOException {
        System.out.println("输入源文件路径：");
        File src = getDir();
        System.out.println("输入目标文件路径：");
        File dest = getDir();
        if(src.equals(dest)){
            System.out.println("目标文件夹是源文件夹的的子文件夹");
        }else{
            copy(src,dest);
        }
        //重命名文件
        String str  = dest.getName() + "-副本";
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
