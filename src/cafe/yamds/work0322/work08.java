package cafe.yamds.work0322;

//8.从键盘接收任意6个数放入数组A中，假设这6个数为：8 1 4 2 5 6 ，则要输出一个具有如下内容的方阵。
//8 1 4 2 5 6
//1 4 2 5 6 8
//4 2 5 6 8 1
//2 5 6 8 1 4
//5 6 8 1 4 2
//6 8 1 4 2 5

import java.util.Scanner;

public class work08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.print("请输入6个值，使用空格隔开: ");
        for(int i = 0; i < 6; i++) {
            arr[i] = input.nextInt();
        }
        input.close();

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++)
                System.out.print(arr[(i+j)%6] + " ");
            System.out.println();
        }

    }
}
