package cafe.yamds.work0322;

//11.一群猴子要选新猴王。新猴王的选择方法是：
// 让N只候选猴子围成一圈，顺序编号为1~N号。
// 从第1号开始报数，每轮从1报到3，凡报到3的猴子即退出圈子，接着又从紧邻的下一只猴子开始同样的报数。
// 如此不断循环，最后剩下的一只猴子就选为猴王。
// 请问是第几号猴子当选猴王？

import java.util.Scanner;

public class work11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入猴子的数量: ");
        int n = input.nextInt();
        input.close();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++)
            arr[i] = i + 1;
        int pos = 0;    // 报数的位置
        while(n > 1) {
            pos = (pos + 3 - 1) % n;
            for(int i = pos; i < arr.length - 1; i++)
                arr[i] = arr[i+1];
            n--;
        }
        System.out.println("猴王: " + arr[0] + "号");
    }
}
