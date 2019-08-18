package cn.ttw.diguiTest;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 从键盘接收一个文件夹路径，统计该文件夹大小 (即文件夹中所有文件的大小)
 *
 */

public class Test1 {
    public static void main(String[] args) throws IOException {
        File dir = getDir();
        System.out.println(getFileLength(dir));


    }

    //从键盘接收一个文件夹路径
    public static File getDir(){
        //创建键盘输入
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个文件夹路径");

        //定义无限循环
        while (true){
            String line = sc.nextLine();
            File dir = new File(line);
            //检查输入（无效路径和文件路径的情况）
            if(!dir.exists()){
                System.out.println("你输入的文件路径不存在，请重新输入");
            }else if (dir.isFile()){
                System.out.println("输入了文件路径，请重新输入");
            }else{
                return dir;
            }
        }
    }

    //统计该文件夹大小
    public static long getFileLength(File dir){     //返回值类型为long，参数列表为File dir
        //定义一个求和变量
        long len = 0;
        //获取该文件夹路径下所有文件和文件夹（listFiles()方法）
        File[] subFiles = dir.listFiles();
        //遍历数组
        for (File subFile : subFiles
             ) {
            //是文件就求和
            if(subFile.isFile()){
                len += subFile.length();
            }else{          //是文件夹就递归调用
                len += getFileLength(subFile);
            }
        }

        return len;
    }



}
