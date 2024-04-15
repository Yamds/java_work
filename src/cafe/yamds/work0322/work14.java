package cafe.yamds.work0322;

//14.NxN的回路矩阵.png
//1  2  3  4
//12 13 14 5
//11 16 15 6
//10 9  8  7

import java.util.Scanner;

public class work14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入n的值: ");
        int n = input.nextInt();
        input.close();

        int[][] arr = new int[n][n];
        int[] dx = {0, 1, 0 ,-1};
        int[] dy = {1, 0, -1, 0};
        int x = 0;
        int y = 0;

        int num = 1;
        int index = 0;  // 方向

        while(num <= n*n) {
            //System.out.println("x = " + x + "\ty = " + y);  //
            if(x >= n || y >= n || x < 0 || y < 0 || arr[x][y] != 0) {  // 是否越界
                x -= dx[index]; // 越界返回
                y -= dy[index];
                index = ++index % 4;    // 更改方向
                num--;
            }
            arr[x][y] = num++;
            x += dx[index];
            y += dy[index];
        }

        // 输出
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + "\t");
            System.out.println();
        }
    }
}
