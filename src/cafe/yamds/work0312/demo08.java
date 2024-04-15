package cafe.yamds.work0312;

import java.util.Scanner;

public class demo08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        int count = 0;
        while (n != 0) {
            count++;
            System.out.print(n%10 + " ");
            n /= 10;
        }
        System.out.println("共有 " + count + " 位");
    }
}
