package cafe.yamds.work0322;

// 0.使用数组来存放Fibonacci数列前30项

import java.util.Scanner;

public class work01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入n的值: ");
        int n = input.nextInt();    // 输入n的值
        input.close();
        int[] arr = new int[n]; // 存储数组
        arr[0] = 1;
        arr[1] = 1;

        for(int i = 2; i < n; i++)
            arr[i] = arr[i-1] + arr[i-2];

        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");


    }
}
