package edu.kjxy.demo0416;

import java.text.DecimalFormat;

public class Demo02 {
	public static void main(String[] args) {
		Integer i = 12;
		int i2 = i;
		
		Integer i3 = i * i2;
		System.out.println(i3);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Long.MAX_VALUE);		//�㹻��Ҫ��BigInteger
		System.out.println(Long.MIN_VALUE);
		
		System.out.println(Double.MAX_VALUE);	//��ȷҪ��BigDecimal
		System.out.println(Double.MIN_VALUE);
		
		String s1 = "2024A";
		//Integer i4 = Integer.parseInt(s1);
		//System.out.println(++i4);
		Integer i4 = Integer.parseInt(s1, 16);
		System.out.println(++i4);
		
		double k = 12345.6789;
		DecimalFormat fmt = new DecimalFormat("#,###.##");	//ǧλ��
		String str = fmt.format(k);
		System.out.println(str);
			
		fmt = new DecimalFormat("000,000,000.##");	//ǰ׺0
		str = fmt.format(k);
		System.out.println(str);
		
		fmt = new DecimalFormat("#,###.##%");	//�ٷֺ�
		str = fmt.format(k);
		System.out.println(str);
	}
}
