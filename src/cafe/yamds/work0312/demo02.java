package cafe.yamds.work0312;

public class demo02 {
    public static void main(String[] args) {
        int n = 30;
        int a = 0;
        int b = 1;
        System.out.printf("第%d项: %d%n", 1, 0); // 前两项
        System.out.printf("第%d项: %d%n", 2, 1);

        //
        for(int i = 3; i <= n; i++) {
            System.out.printf("第%d项: %d%n", i, a+b);
            b = a+b;
            a = b-a;
        }

    }
}
