package edu.kjxy.demo0426;

import java.util.Scanner;

public class demo04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        input.close();

        if(age < 0 || age > 150)
            throw new AgeException("年龄只能在0-150之间.");
        else
            System.out.println("还过" + (150-age) + "就能领钱了");
    }
}
