package cafe.yamds.work0322;

// 3.{3, 6, 54, 8, 4, 2, 101, 4, 11, 22, 33, 55}数组逆序打印

public class work04 {
    public static void main(String[] args) {
        int[] n = {3, 6, 54, 8, 4, 2, 101, 4, 11, 22, 33, 55};

        for(int i = n.length-1; i >= 0; i--) {
            System.out.print(n[i] + "\t");
        }
    }
}
