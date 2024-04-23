package edu.kjxy.demo0416;

public class PersonDemo {
	public static void main(String[] args) {
		Person p1 = new Person();
		
		//System.out.println(p1.idno);
		
		//p1.idno = "420503324234";	//封装的属性不能直接读写
		p1.setIdno("420503324234");
		p1.setGender("男");
		p1.setName("张三丰");
		
		System.out.println(p1.toString());
		
		System.out.println(p1.getIdno());
		System.out.println(p1.getName());
	}
}
