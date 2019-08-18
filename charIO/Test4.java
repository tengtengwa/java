package cn.ttw.charIO;
import	java.lang.reflect.Field;
import	java.util.Scanner;
import	java.io.File;
import	java.util.Map;

/**
 * 要求：从键盘输入接收一个文件夹路径，打印该文件夹下所有的.java文件名
 *
 * 分析：
 *  接收：如果录入不存在的文件夹路径（不存在/文件路径），给予提示
 *  打印：
 *      1.获取该文件夹路径下所有文件和文件夹，储存在File数组中
 *      2.遍历数组，对每一个文件或文件夹做判断
 *      3.如果是.java文件就打印，如果是文件夹就递归调用
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
        System.out.print("请输入一个文件夹路径：");
        while (true){
            String line = scanner.nextLine();
            File dir = new File(line);
            if(!dir.exists()){
                System.out.println("你录入的文件夹路径不存在，请重新输入");
            }else if(dir.isFile()){
                System.out.println("你录入的是文件路径，请重新输入");
            }else{
                return dir;
            }
        }
    }

    //获取文件夹路径下所有.java文件
    public static void printJavaFile(File dir) {
        //1.获取该文件夹路径下所有文件和文件夹，储存在File数组中
        File[] subFiles = dir.listFiles();
        //2.遍历数组，对每一个文件或文件夹进行判断
        for (File subFile : subFiles) {
            //3.如果是.java文件就直接打印
            if(subFile.isFile() && subFile.getName().endsWith(".java")){
                System.out.println(subFile);
            }else if(dir.isDirectory()){        //是目录就递归调用
                printJavaFile(subFile);
            }
        }

    }


}











