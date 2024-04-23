package edu.kjxy.demo0408;

public class demo01 {

	public static void main(String[] args) {
		Person p1 = new Person();	// 类 对象变量 = new 构造函数();
		p1.name = "王五常";
		p1.eat("苹果");
		
		Person p2 = new Person("114514", "张三丰", "2005-05-05", "男");
		p2.eat("枪子");
		p2.sleep(10000000);
		
		Person p3 = new Person("114514", "2005-05-05", "女");
		p3.name = "唐三藏";
		p3.eat("唐三藏");
		p3.sleep(10);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
	}

}
