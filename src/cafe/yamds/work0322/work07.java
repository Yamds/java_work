package cafe.yamds.work0322;

//7.先输入一个年份，再输入一个1到365/366的天数，输出这一天所在的月份及当月日期，m月d号。注意处理闰年。
//提示：每月的天数放在数组中
//2021 100
//4月10号

import java.util.Scanner;

public class work07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入年和天数，使用空格隔开: ");
        int year = input.nextInt();
        int days = input.nextInt();
        input.close();

        int[] months = (year % 4 ==0 && year % 100 != 0) || (year % 400 == 0) ?
                new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} :
                new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int m = 1;  // 累加月份

        while(days - months[m] > 0) {
            days -= months[m++];
        }

        System.out.println(m + "月\t" + days + "日");


    }
}
