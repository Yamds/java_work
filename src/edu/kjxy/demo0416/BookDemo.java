package edu.kjxy.demo0416;

import java.math.BigDecimal;

public class BookDemo {
	public static void main(String[] args) {
		Book b1 = new Book("6546546549", "Java�����ŵ����", "��Ͽ��ѧ������", "������", new BigDecimal("120.88"));
		System.out.println(b1);
		
		Book b2 = new Book("6546578765", "MySQL�����ŵ����", "�廪��ѧ������", "���Ĺ�", new BigDecimal("9.9"));
		System.out.println(b2);
	}
}	
