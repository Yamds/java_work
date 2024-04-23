package edu.kjxy.demo0308;

import java.util.Scanner;

public class demo03 {

	public static void main(String[] args) {
		System.out.print("请输入一个整数:");
		Scanner in = new Scanner(System.in);
		int day = in.nextInt();
		in.close();
		
		switch(day) {
		case 1: System.out.println("星期一");break;
		case 2: System.out.println("星期二");break;
		case 3: System.out.println("星期三");break;
		case 4: System.out.println("星期四");break;
		case 5: System.out.println("星期五");break;
		case 6: System.out.println("星期六");break;
		case 7: System.out.println("星期七");break;
		default: System.out.println("输入错误！");
		}
		
		switch(day) {
		case 1: 
		case 2: 
		case 3: 
		case 4: 
		case 5: System.out.println("工作日");break;
		case 6: 
		case 7: System.out.println("休息日");break;
		default: System.out.println("输入错误！");
		}
		// switch 语句块
		switch(day) {
		case 1, 2, 3, 4, 5 -> System.out.println("工作日");
		case 6, 7 -> System.out.println("休息日");
		default -> System.out.println("输入错误！");
		}
		
		// switch 表达式
		String info = switch(day) {
		case 1, 2, 3, 4, 5 -> "工作日";
		case 6, 7 -> "休息日";
		default -> "输入错误！";
		};// 分号要注意
		
		System.out.println(info);
	}

}
