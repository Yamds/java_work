package edu.kjxy.demo0507;

import java.io.File;
import java.io.IOException;

public class demo01file {
    public static void main(String[] args) {
        File f = new File("./src/edu/kjxy/demo0507/abc.txt");    // 路径指向
        if(f.exists())  // 如果文件存在则删除
            f.delete();
        try {
            f.createNewFile();
        } catch(IOException ex)  {
            ex.printStackTrace();
        }

        System.out.println(f.getName());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.isDirectory());
        System.out.println(f.canWrite());
        System.out.println(f.length());
    }
}
