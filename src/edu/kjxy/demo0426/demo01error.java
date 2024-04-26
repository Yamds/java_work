package edu.kjxy.demo0426;

public class demo01error {
    public static void main(String[] args) {
        try {
            int a = 5;
            int b = 0;
            System.out.println(a / b);

            int[] ar = {1, 2, 3};
            System.out.println(ar[3]);
        }catch(ArithmeticException ex){
            System.out.println("算术异常发生了.");
            System.err.println("算术");
            ex.printStackTrace();
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("数组越界异常发生了.");
            ex.printStackTrace();
        }catch(Throwable ex){
            System.out.println("未知n异常发生了.");
            ex.printStackTrace();
        }finally{
            System.out.println("无论是否异常，finally都执行");
        }

        System.out.println("有异常处理补救措施，程序可以到这来");
    }
}
