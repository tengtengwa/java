package cn.ttw.diguiTest;

import java.math.BigInteger;

/**
 * 求1000的阶乘的所有零和尾部零的个数，不用递归作
 *    BigInteger的加减乘除方法：
 *      add()，subtract()，multiply()，divide()
 */

public class Test5 {
    public static void main(String[] args) {
        BigInteger bi1 = new BigInteger("1");       //BigInteger(String val)    bi1储存每次阶乘的结果
        for(int i = 1; i <= 1000; i++){
            BigInteger bi2 = new BigInteger(i + "");
            bi1 = bi1.multiply(bi2);
        }

        String str = bi1.toString();        //toString方法转为字符串
        int sum = 0;
        int end0 = 0;

        //获取所有零
        for (int i = 0; i < str.length() ; i++){
            if('0' == str.charAt(i)){       //字符串的charAt方法
                sum++;
            }
        }

        //获取尾零
        for(int j = str.length()-1; j >= 0; j--){
            if('0' == str.charAt(j)){
                end0++;
            }else{
                break;
            }

        }

        System.out.println(bi1);
        System.out.println("所有零的个数: " + sum);
        System.out.println("末尾零的个数：" + end0);
    }
}
