package cafe.yamds.work0322;

//12.输出如下矩阵，共10行。
//1 3 6 10 15
//2 5 9 14
//4 8 13
//7 12
//11

public class work12 {
    public static void main(String[] args) {
        int[][] arr = new int[10][10];

        int num = 1;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                arr[i - j][j] = num;
                num++;
            }
        }

        // 输出
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length - i; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}