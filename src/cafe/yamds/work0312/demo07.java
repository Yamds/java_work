package cafe.yamds.work0312;

import java.util.Scanner;

public class demo07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        input.close();

        int sum = 0;
        while(n!=0) {
            sum += (int) (n%10);
            n /= 10;
        }
        System.out.println("sum = " + sum);
    }
}
