package cafe.yamds.work0329;

// 2.定义一个方法sumDouble对数组double[]求和，定义一个方法sumInt对数组int[]求和。并在main中调用

public class work03 {
    public static void main(String[] args) {
        int[] ni = {10, 8, 4, 2};
        double[] nd = {10.5, 8.4, 4.3, 2.2};

        System.out.println("sumDouble : " + sumDouble(nd));
        System.out.println("sumInt : " + sumInt(ni));
    }

    public static double sumDouble(double... n) {
        double sum = 0;
        for(double it : n) {
            sum += it;
        }
        return sum;
    }
    // sumInt
    public static int sumInt(int... n) {
        int sum = 0;
        for(int it : n) {
            sum += it;
        }
        return sum;
    }
}
