package cn.ttw.diguiTest;

import java.util.ArrayList;

/**
 * Լɪ��
 *
 */

public class Test6 {
    public static void main(String[] args) {
        System.out.println(getLuckyNum(500));


    }

    public static int getLuckyNum(int num){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 1; i <= num; i++){
            arr.add(i);                      //��1~num��ӵ�������
        }

        int count = 1;                  //��������
        for(int i = 0; arr.size() != 1; i++){
            if(i == arr.size()){         //i���ӵ������������+1ʱ����
                i = 0;
            }

            if(count % 3 == 0){         //ֻҪ��3�ı�������ɱ��
                arr.remove(i--);
            }
            count++;
        }
        return arr.get(0);
    }

}
