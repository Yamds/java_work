package cafe.yamds.work0312;

import java.util.Scanner;

public class demo06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        int sum = 0;
        for(int i = 0; i < n; i++)
            sum+=i;

        System.out.println("sum = " + sum);
    }
}
