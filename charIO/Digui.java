package cn.ttw.charIO;
import	java.util.function.Function;
import	java.lang.annotation.ElementType;
import	java.util.Map;

public class Digui {
    public static void main(String[] args) {
        System.out.println(fun(5));


    }
    public static int fun(int num){
        if(num == 1){
            return 1;
        }else{
            return num * fun(num - 1);
        }
    }

}

