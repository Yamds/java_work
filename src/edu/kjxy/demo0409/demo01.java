package edu.kjxy.demo0409;

public class demo01 {

	public static void main(String[] args) {
		Car c = new Car("鄂E88888", "保时捷", 219000);
		Person p1 = new Person("5656513232312", "唐三藏", "2000-05-05", "男", c);
		p1.eat("苹果");
		p1.travel("三峡大坝");
		
		System.out.println("现在有" + Person.count + "个人");

		Person p2 = new Person("565651323231", "王二麻子", "2000-05-05", "男");
		p2.travel("沙河公园");
		Car c2 = new Car("鄂E99999", "老头乐", 20000);
		p2.car = c2;
		p2.travel("沙河公园");
		
		System.out.println("现在有" + Person.count + "个人");
		
		Person p3 = new Person();
		System.out.println("现在有" + Person.count + "个人");

	}

}
