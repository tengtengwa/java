package cn.ttw.diguiTest;


import java.io.File;

/**
 * �Ӽ��̽���һ���ļ���·����ɾ�����ļ���
 *
 */

public class Test2 {
    public static void main(String[] args) {
        File dir = Test1.getDir();
        deleteDir(dir);
    }

    public static void deleteDir(File dir){
        File[] subFiles = dir.listFiles();
        for (File subFile : subFiles
             ) {
            if(subFile.isFile()){
                subFile.delete();
            }else {
                deleteDir(subFile);
            }
        }
        dir.delete();
    }

}
