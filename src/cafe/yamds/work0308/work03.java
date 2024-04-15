package cafe.yamds.work0308;

import java.util.Objects;
import java.util.Scanner;

public class work03 {
    public static void main(String[] args) {
        System.out.print("请输入 <数字1 符号 数字2>：");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        String str = input.next();
        double b = input.nextDouble();
        input.close();

        double ans = (Objects.equals(str, "+") ? a+b :  // 字符串比较函数
                     (Objects.equals(str, "-") ? a-b :
                     (Objects.equals(str, "*") ? a*b :
                     (Objects.equals(str, "/") ? a/b : a%b))));

        System.out.println(a + str + b + "=" + ans );
    }
}
