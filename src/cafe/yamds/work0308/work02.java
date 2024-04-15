package cafe.yamds.work0308;

import java.util.Scanner;

public class work02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("年份：");
        int year = input.nextInt();
        System.out.println("月份：");
        int month = input.nextInt();
        input.close();

        if(month <= 0 || month >= 13)
            System.out.println("输入错误。");
        else{
            if(month == 2)
                if(year%4==0&&year%100!=0 || year%400==0)
                    System.out.println("29");
                else
                    System.out.println("28");
            else
                switch(month) {
                    case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31");
                    case 4, 6, 9, 11 -> System.out.println("30");
                }
        }

    }
}
