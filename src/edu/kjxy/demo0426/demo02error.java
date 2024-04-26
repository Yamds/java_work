package edu.kjxy.demo0426;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class demo02error {
    // 声明可能出错
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("G:/abc.txt");
        pw.println("Hello Java");
        pw.close();
    }
}
