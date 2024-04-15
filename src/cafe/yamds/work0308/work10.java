package cafe.yamds.work0308;

import java.util.Scanner;

public class work10 {
    public static void main(String[] args) {

        System.out.println("请输入年份:");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt(); //输入年
        System.out.println("请输入月份:");
        int month = input.nextInt(); //输入月份
        input.close();

        int numDays=0;
        switch(month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:numDays=31;//1、3、5、7、8、10、12月天数为31
                break;//跳出switch语句
            case 4:
            case 6:
            case 9:
            case 11:numDays=30;//4、6、9、11月天数为30
                break;
            case 2:
                if((year%4==0)&&!(year%100==0)||(year%400==0)) {
                    numDays=29;
                }else{
                    numDays=28;
                }
                break;
        }
        System.out.println(year + "年" + month + "月份" + "有" + numDays + "天");
    }
}
