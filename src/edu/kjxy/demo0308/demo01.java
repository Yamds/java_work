package edu.kjxy.demo0308;

import java.util.Scanner;

public class demo01 {

	public static void main(String[] args) {
		System.out.print("请输入一个整数:");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		
		if(n%2==0)
			System.out.println(n + "是偶数。");
		else
			System.out.println(n + "是奇数。");
		
		String str = (n%2==0) ? "偶数":"奇数";
		System.out.println(n + "是" + str);

	}

}
