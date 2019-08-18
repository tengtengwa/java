package cn.ttw.kh;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class t24 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("abc");
        list.add("acd");
        list.add("abd");
        list.add("abd");

        HashSet<String> hs = new HashSet<>();
        hs.add("abc");
        hs.add("abc");
        hs.add("acd");
        hs.add("abd");
        hs.add("abd");
        System.out.println(hs);

    }
}
