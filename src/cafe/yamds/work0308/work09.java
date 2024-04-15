package cafe.yamds.work0308;

import java.util.Scanner;

public class work09 {
    public static void main(String[] args) {
        System.out.print("请输入三角形的边长:");
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        in.close();

        double zc;
        double mj;
        double s;
        s=(a+b+c)/2;
        if(a+b>c || a+c>b || b+c>a) {
            zc = a + b + c;
            mj = Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println("三角形的周长为%.2f,面积为%.2f".formatted(zc, mj));
        }
        else System.out.println("输出错误");
    }
}
