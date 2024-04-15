package cafe.yamds.work0329;

// 1.写一个函数，计算两点(x1, y1)和(x2, y2)之间的距离。并在main中调用

public class work02 {
    public static void main(String[] args) {
        System.out.println(dis(5,6,7,8));
    }

    public static double dis(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
