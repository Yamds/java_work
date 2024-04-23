package edu.kjxy.demo030102;

public class HelloCircle {

	public static void main(String[] args) {
		double r = 10.0;
		double a = Math.PI * r * r;
		double c = Math.PI * 2 * r;
		
		System.out.println("面积 = " + a + "  周长 = " + c);
		
		String str = "面积:%.2f, 周长:%.2f".formatted(a, c);
		System.out.println(str);
	}

}
