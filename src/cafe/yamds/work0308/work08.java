package cafe.yamds.work0308;

import java.util.Scanner;

public class work08 {
    public static void main(String[] args) {
        System.out.println("请输入购买洗衣粉的数量:");
        Scanner in = new Scanner(System.in);
        int amount = in.nextInt();
        in.close();
        double sum = 11.3*amount;
        if (sum > 50) {
            sum *= 0.85;
            System.out.println("最终付款金额是%.2f(0.85折)".formatted(sum));
        }
        else
            System.out.println("最终付款金额是%.2f(没有折扣)".formatted(sum));
    }
}
