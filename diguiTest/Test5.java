package cn.ttw.diguiTest;

import java.math.BigInteger;

/**
 * ��1000�Ľ׳˵��������β����ĸ��������õݹ���
 *    BigInteger�ļӼ��˳�������
 *      add()��subtract()��multiply()��divide()
 */

public class Test5 {
    public static void main(String[] args) {
        BigInteger bi1 = new BigInteger("1");       //BigInteger(String val)    bi1����ÿ�ν׳˵Ľ��
        for(int i = 1; i <= 1000; i++){
            BigInteger bi2 = new BigInteger(i + "");
            bi1 = bi1.multiply(bi2);
        }

        String str = bi1.toString();        //toString����תΪ�ַ���
        int sum = 0;
        int end0 = 0;

        //��ȡ������
        for (int i = 0; i < str.length() ; i++){
            if('0' == str.charAt(i)){       //�ַ�����charAt����
                sum++;
            }
        }

        //��ȡβ��
        for(int j = str.length()-1; j >= 0; j--){
            if('0' == str.charAt(j)){
                end0++;
            }else{
                break;
            }

        }

        System.out.println(bi1);
        System.out.println("������ĸ���: " + sum);
        System.out.println("ĩβ��ĸ�����" + end0);
    }
}
