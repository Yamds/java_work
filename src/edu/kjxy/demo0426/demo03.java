package edu.kjxy.demo0426;

public class demo03 {
    public static void main(String[] args) {
        int fen = 105;
        if(fen < 0 || fen > 100)
            throw new RuntimeException("成绩只能在0-100之间");
        else
            System.out.println("你离满分还差" + (100-fen));

        System.out.println("程序正常结束");
    }
    // throw 抛出一个具体的异常类实例
    // throws
    //  RuntimeException 非检查异常。之外的异常异常，必须使用try-catch或throws。
}
