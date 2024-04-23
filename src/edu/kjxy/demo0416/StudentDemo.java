package edu.kjxy.demo0416;

public class StudentDemo {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1.toString());
		
		System.out.println(s1.getName());
		s1.eat("旺旺饼干");
		
		
		Student s2 = new Student("5654654", "张无忌", "2000-09-09", "男", "2022493399");
		System.out.println(s2.toString());
		
		System.out.println(s2.getName());
		s2.eat("老面馒头");
		s2.work("Java");
	}
}
