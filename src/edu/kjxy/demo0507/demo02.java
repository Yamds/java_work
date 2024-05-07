package edu.kjxy.demo0507;

import java.io.File;

public class demo02 {
    public static void main(String[] args) {
        File f = new File("./src/edu/kjxy/demo0507/aaa/bbb");
        f.mkdirs(); // 创建目录

        File f2 = new File("d:/");
        String[] a = f2.list();
        for(String s : a) {
            System.out.println(s);
        }

        File[] fa = f2.listFiles();
        for(File x : fa) {
            System.out.println(x.getName() + " - " + x.isDirectory() + " - " + x.length());
        }
    }
}
