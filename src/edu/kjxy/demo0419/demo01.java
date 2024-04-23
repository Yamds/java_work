package edu.kjxy.demo0419;

public class demo01 {
    public static void main(String[] args) {
        Computer c = new Computer("c001", "联想", "Java学习资料");
        Phone p = new Phone("p001", "华为");
        c.copy(p);
    }
}
