package cn.ttw.thread;


import java.io.IOException;

public class TestRuntime {
    public static void main(String[] args) throws IOException {
        Runtime r = Runtime.getRuntime();
        //r.exec("shutdown -s -t 500");
        r.exec("shutdown -a");
    }
}
