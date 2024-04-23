package edu.kjxy.demo0301;

public class HelloLight {

	public static void main(String[] args) {
		int speed = 300000;
		int days = 365;
		
		long seconds = days * 24 * 60 * 60;
		long lightYear = speed * seconds;
		
		System.out.println("一光年 = " + lightYear + "公里/s");
	}

}
