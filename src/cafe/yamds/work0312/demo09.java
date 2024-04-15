package cafe.yamds.work0312;

import java.util.Scanner;

public class demo09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        int bin = 0;
        int count = 1;
        while(n != 0) {
            bin += n%2*count;
            count *= 10;
            n/=2;
        }
        System.out.print(bin);
    }
}
