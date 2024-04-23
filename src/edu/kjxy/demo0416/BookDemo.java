package edu.kjxy.demo0416;

import java.math.BigDecimal;

public class BookDemo {
	public static void main(String[] args) {
		Book b1 = new Book("6546546549", "Java从入门到起飞", "三峡大学出版社", "张三丰", new BigDecimal("120.88"));
		System.out.println(b1);
		
		Book b2 = new Book("6546578765", "MySQL从入门到起飞", "清华大学出版社", "李四光", new BigDecimal("9.9"));
		System.out.println(b2);
	}
}	
