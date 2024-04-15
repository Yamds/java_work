package cafe.yamds.work0312;

import java.util.Scanner;

public class demo03 {
    public static void main(String[] args) {
        System.out.println("请输入0, 1, 2, 3, 4 (0退出其他分别表示东南西北): ");
        int i;
        Scanner input = new Scanner(System.in);
        i = input.nextInt();
        while(i != 0) {
            String ans = switch (i) {
                case 1 -> "东";
                case 2 -> "南";
                case 3 -> "西";
                case 4 -> "北";
                default -> "输入错误";
            };
            System.out.println("结果: " + ans);
            i = input.nextInt();
        }
        input.close();
    }
}
