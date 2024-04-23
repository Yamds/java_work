package edu.kjxy.demo030502;

import java.util.Scanner;

public class HelloJava {

	public static void main(String[] args) {
		System.out.print("请输入一个整数:");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		input.close();
		
		System.out.println(num >= 60 && num <= 69);
		System.out.println(!(num < 60) && !(num > 70));
		System.out.println(!(num < 60 || num > 70));
		

	}

}
