package cafe.yamds.work0322;

// 4.输入一个值，查找数组{3, 6, 54, 8, 4, 2, 101, 4, 11, 22, 33, 55}是否包含它。

import java.util.Scanner;

public class work05 {
    public static void main(String[] args) {
        int[] n = {3, 6, 54, 8, 4, 2, 101, 4, 11, 22, 33, 55};
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个用来查找的数: ");
        int find = input.nextInt();
        input.close();

        for(int i = 0; i < n.length; i++) {
            if(n[i] == find) {
                System.out.println("包含, 在" + i + "项");
                break;
            }
            else if(i == n.length-1) {
                System.out.println("不包含！");
            }
        }


    }
}
