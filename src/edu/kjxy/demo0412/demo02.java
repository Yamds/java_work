package edu.kjxy.demo0412;

public class demo02 {
	public static void main(String[] args) {
		String s1 = "sxdxkjxy";
		String s2 = "123";
		
		String s3 = s1.concat(s2);	//拼接
		System.out.println(s3);
		
		String s4 = s1 + s2;
		System.out.println(s4);
		
		System.out.println(s3 == s4); 	// 比较地址而非值
		// 双等号 对基本数据类型比较值;
		//		 对对象数据类型比较地址;
	}
}
