package cn.ttw.kh;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

//Çë°´ÕÕkeyµÄ×ÖµäĞòÊä³övalue
public class t25 {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("asdfg",1);
        map.put("ca",3);
        map.put("bsag",2);
        map.put("ddd",4);

        TreeSet<String> ts = new TreeSet<>();
        ts.add("asdfg");
        ts.add("bsag");
        ts.add("ca");
        ts.add("ddd");
        for (Iterator<String> iter = ts.iterator(); iter.hasNext(); ) {
            System.out.println(map.get(iter.next()));
        }
    }
}
