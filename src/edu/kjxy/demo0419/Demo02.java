package edu.kjxy.demo0419;

public class Demo02 {
	public static void main(String[] args) {
		Computer c = new Computer("C001", "����", "Javaѧϰ��Ƶ");
		
		Phone p = new Phone("P001", "��Ϊ");
		
		c.copy(p);
	}
}
