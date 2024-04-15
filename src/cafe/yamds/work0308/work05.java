package cafe.yamds.work0308;

import java.util.Scanner;

public class work05 {
    public static void main(String[] args) {
        System.out.print("请输入三角形三边长，使用空格隔开:");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        double l = 0;
        double s = 0;

        String ans = "不构成三角形";

        if (a + b > c && b + c > a && a + c > b) {
            if (a == b && b == c)
                ans = "正三角形";
            else if (a == b || b == c || a == c)
                if (a * a + b * b == c * c || b * b + c * c == a * a || a * a + c * c == b * b)
                    ans = "等腰直角三角形";
                else
                    ans = "等腰三角形";
            else if (a * a + b * b == c * c || b * b + c * c == a * a || a * a + c * c == b * b)
                ans = "直角三角形";
            else
                ans = "不规则三角形";
            l = a + b + c;
            double p = l / 2;
            s = Math.sqrt(p * (p - a) * (p - b) * (p - c));  // 海伦公式
        }

        System.out.println("形状: %s, 周长: %f, 面积: %f".formatted(ans, l, s));
    }
}
