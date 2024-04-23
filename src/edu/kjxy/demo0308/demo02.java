package edu.kjxy.demo0308;

import java.util.Scanner;

public class demo02 {

	public static void main(String[] args) {
		System.out.print("请输入一个整数:");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		in.close();

		int max;
		if(a > b && a > c)
			max = a;
		else if(b > c)
			max = b;
		else
			max = c;
		
		System.out.println("max = " + max);
		
		max = (a > b && a > c) ? a : (b > c ? b : c);
		System.out.println("max = " + max);
		
	
		
	}

}
