package cn.ttw.diguiTest;

import java.io.File;

/**
 * 从键盘接收一个文件夹路径，把文件夹中的所有文件和文件夹的名称按层级打印
 *
 */


public class Test4 {
    public static void main(String[] args) {
        File dir = Test1.getDir();
        printLev(dir,0);


    }

    public static void printLev(File dir, int lev){
        File[] subFiles = dir.listFiles();
        for (File subFile : subFiles
             ) {

            for(int i = 0; i <= lev; i++){
                System.out.print("\t");
            }

            System.out.println(subFile);
            if(subFile.isDirectory()){
                printLev(subFile,lev + 1);
            }
        }

    }

}
