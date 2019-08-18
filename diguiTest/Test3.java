package cn.ttw.diguiTest;

import java.io.*;

/**
 * 键盘接收两个文件夹路径，将其中一个文件夹中（包含内容）拷贝到另一个文件夹中
 *
 */

public class Test3 {
    public static void main(String[] args) throws IOException {
        File src = Test1.getDir();
        File dest = Test1.getDir();
        if(src.equals(dest)){
            System.out.println("目标文件夹是源文件夹的子文件夹");
        }else{
            copy(src,dest);
        }


    }

    public static void copy(File src, File dest) throws IOException{
        //在目标文件夹(dest)中创建源文件夹(空文件夹)
        File newDir = new File(dest,src.getName());
        newDir.mkdir();
        //获取源文件夹中所有文件和文件夹，储存在File数组中
        File[] subFiles = src.listFiles();
        //遍历数组
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
                copy(subFile,newDir);           //是文件夹，就递归调用
            }
        }

    }
}
