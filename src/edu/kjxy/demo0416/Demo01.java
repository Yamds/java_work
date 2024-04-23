package edu.kjxy.demo0416;

public class Demo01 {
	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Math.E);
		
		double val = Math.sin(Math.PI/6);	//不精确
		String str = "%.2f".formatted(val);	//四舍五入
		System.out.println(str);
		
		System.out.println(Math.sqrt(100));		//开平方
		System.out.println(Math.pow(2, 16));	//求指数
	}
}
