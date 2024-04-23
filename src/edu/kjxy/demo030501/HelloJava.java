package edu.kjxy.demo030501;

import java.util.Scanner;

public class HelloJava {

	public static void main(String[] args) {
		System.out.print("请输入两个数:");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		input.close();
		;
		System.out.println("%d + %d = %d".formatted(a, b, a+b));
		System.out.println("%d - %d = %d".formatted(a, b, a-b));
		System.out.println("%d * %d = %d".formatted(a, b, a*b));
		System.out.println("%d / %d = %d".formatted(a, b, a/b));
		System.out.println("%d %% %d = %d".formatted(a, b, a%b));
		
		System.out.println("\n");
		
		int m = 7;
		int n = 7;
		
		m = n++;
		System.out.println("m=%d, n=%d".formatted(m,n));
		m = ++n;
		System.out.println("m=%d, n=%d".formatted(m,n));
		m = n--;
		System.out.println("m=%d, n=%d".formatted(m,n));
		m = --n;
		System.out.println("m=%d, n=%d".formatted(m,n));
		
		
	}

}
