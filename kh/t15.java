package cn.ttw.kh;

public class t15 {
//    public class Test{
//        public static void main(String[] args){
//            Outer.method().show();
//        }
//    }
//
//    interface Inner{
//        void show();
//    }
//
//    static class Outer{
//        //补齐代码
//        static class method implements Inner {
//            public void show(){
//                System.out.println("Hello World!");
//            }
//        }
//    }
//
    public static void main(String[] args) {
        String s = new String("abc");
        String s1 = "abc";
        String s2 = new String("abc");

        System.out.println(s == s1);
        System.out.println(s == s2);
        System.out.println(s1 == s2);
    }



//要求在控制台输出Hello World!
}
