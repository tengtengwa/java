package cn.ttw.diguiTest;

import java.util.ArrayList;

/**
 * 约瑟夫环
 *
 */

public class Test6 {
    public static void main(String[] args) {
        System.out.println(getLuckyNum(500));


    }

    public static int getLuckyNum(int num){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 1; i <= num; i++){
            arr.add(i);                      //将1~num添加到集合中
        }

        int count = 1;                  //用来计数
        for(int i = 0; arr.size() != 1; i++){
            if(i == arr.size()){         //i增加到集合最大索引+1时归零
                i = 0;
            }

            if(count % 3 == 0){         //只要是3的倍数，就杀人
                arr.remove(i--);
            }
            count++;
        }
        return arr.get(0);
    }

}
