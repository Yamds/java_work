package edu.kjxy.demo0409;

public class Car {
	String cid;
	String brand;
	long price;
	
	// 构造函数
	public Car() {
		super();
	}
	public Car(String cid, String brand, long price) {
		super();
		this.cid = cid;
		this.brand = brand;
		this.price = price;
	}
	
	// 方法
	public void drive(String dest) {
		System.out.println(cid + "开往" + dest);
	}
}
