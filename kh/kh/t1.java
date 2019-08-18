package cn.ttw.kh.kh;

import java.util.ArrayList;
import java.util.List;

public class t1 {
    public static void main(String[] args) {
        circle c = new circle();
        System.out.println(c.num(7, 4));


    }
}


class circle {
    public int num(int n, int k) {

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        int i = 0;
        int t = 1;
        while (list.size() != 1) {
            for(; i < list.size(); i++) {
                if (t == k) {
                    list.remove(i);
                    i--;
                    t = 1;
                } else {
                    t += 1;
                }
            }
            if (i == list.size()) {
                i = 0;
            }
        }
        return list.get(0);
    }
}