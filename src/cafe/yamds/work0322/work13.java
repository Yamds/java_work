package cafe.yamds.work0322;

//13.输出如下矩阵，共10行。
//1 3 4 10 11
//2 5 9 12
//6 8 13
//7 14
//15

public class work13 {
    public static void main(String[] args) {
        int[][] arr = new int[10][10];

        int num = 1;
        int flag = -1;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                if(flag == 1) {
                    arr[i - j][j] = num;
                }
                else {
                    arr[j][i - j] = num;
                }
                num++;
            }
            flag *= -1;
        }

        // 输出
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length - i; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}
