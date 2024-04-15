package cafe.yamds.work0322;

// 1.{3, 6, 54, 8, 4, 2, 101, 4, 11, 22, 33, 55}数组求和及平均值

public class work02 {
    public static void main(String[] args) {
        int[] n = {3, 6, 54, 8, 4, 2, 101, 4, 11, 22, 33, 55};
        int sum = 0;

        for(int i = 0; i < n.length; i++) {
            sum += n[i];
        }

        System.out.println("sum = " + sum + "\tavg = " + sum*1.0/n.length);
    }
}
