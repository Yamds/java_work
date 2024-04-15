package cafe.yamds.work0312;

import java.util.Scanner;

public class demo01 {
    public static void main(String[] args) {
        int i;
        int max;
        int min;
        int sum = 0;
        int count = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("请输入任意个非零的数，输入0终止");
        i = input.nextInt();

        max = i;
        min = i;
        while (i != 0) {
            i = input.nextInt();
            if(i > max) max = i;
            if(i < min) min = i;
            sum += i;
            count++;
        }
        input.close();
        System.out.println("平均值:" + sum*1.0/count + "\t最大值:" + max + "\t最小值:" + min);

    }
}
