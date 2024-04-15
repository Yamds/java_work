package cafe.yamds.work0322;

// 2.{3, 6, 54, 8, 4, 2, 101, 4, 11, 22, 33, 55}中的最大值和最小值

public class work03 {
    public static void main(String[] args) {
        int[] n = {3, 6, 54, 8, 4, 2, 101, 4, 11, 22, 33, 55};
        int max = n[0];
        int min = n[0];

        for(int i = 1; i < n.length; i++) {
            if(n[i] > max)
                max = n[i];
            if(n[i] < min)
                min = n[i];
        }

        System.out.println("max = " + max + "\tmin = " + min);
    }
}
