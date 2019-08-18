package cn.ttw.kh;

public class Test {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.display(6);
    }
}

class Outer {
    private int num = 5;

    public void display(int temp) {
        class Innter {
            public void fun() {
                System.out.println(num);
//                temp++;
                System.out.println(temp);
            }
        }
        new Innter().fun();

    }
}

