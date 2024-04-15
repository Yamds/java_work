package cafe.yamds.work0322;

// 6.先输入一个年份，再输入日期m月d号，输出这一天是这一年的第几天，1到365/366。注意处理闰年。
// 2021 4 10
// 100

import java.util.Scanner;

public class work06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入年月日，空格隔开: ");
        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();
        input.close();

        int days = 0;   // 天数总和

        while(month > 0) {
            days += switch (--month) {
                case 1, 3, 5, 7, 8, 10, 12 -> 31;
                case 4, 6, 9, 11 -> 30;
                case 2 -> (year % 4 ==0 && year % 100 != 0) || (year % 400 == 0) ? 29 : 28;
                default -> 0;
            };
        }

        if(days == 0)
            System.out.print("输入错误！");
        else {
            days += day;
            System.out.print("这是第 " + year + " 年的第 " + days + " 天");
        }
    }
}
