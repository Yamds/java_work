package edu.kjxy.demo0416;

public class Demo01 {
	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Math.E);
		
		double val = Math.sin(Math.PI/6);	//����ȷ
		String str = "%.2f".formatted(val);	//��������
		System.out.println(str);
		
		System.out.println(Math.sqrt(100));		//��ƽ��
		System.out.println(Math.pow(2, 16));	//��ָ��
	}
}
