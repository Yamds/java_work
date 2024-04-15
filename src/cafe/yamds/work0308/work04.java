package cafe.yamds.work0308;

import java.util.Objects;
import java.util.Scanner;

public class work04 {
    public static void main(String[] args) {
        System.out.print("请输入是否晴天(y/n)以及奖金数, 使用空格隔开:");
        Scanner input = new Scanner(System.in);
        String flag = input.next();
        int money = input.nextInt();
        input.close();

        String ans = Objects.equals(flag, "y") ? (money > 500 ? "动物园" : "爬山") : "在家看书学习";

        System.out.println(ans);
    }
}
