package cafe.yamds.work0312;

import java.util.Scanner;

public class demo12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        String hex = "";
        while(n != 0) {

            hex += switch (n%16) {
                case 0,1,2,3,4,5,6,7,8,9 -> n%16;
                case 10 -> 'A';
                case 11 -> 'B';
                case 12 -> 'C';
                case 13 -> 'D';
                case 14 -> 'E';
                case 15 -> 'F';
                default -> "";
            };
            n/=16;
        }
        for (int i = hex.length() - 1; i >= 0; i--) {
            System.out.print(hex.charAt(i));
        }
    }

}
