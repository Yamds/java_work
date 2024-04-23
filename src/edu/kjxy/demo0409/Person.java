package edu.kjxy.demo0409;

public class Person {
	String id;	//身份证号
	String name;	// 姓名
	String birthday;	// 生日
	String gender;	// 性别
	
	Car car;	// 人可以拥有一辆车
	
	static int count = 0;
	
	public Person() {
		count++;
	}
	
	public Person(String id, String birthday, String gender) {
		super();
		this.id = id;
		this.birthday = birthday;
		this.gender = gender;
		count++;
	}

	// 构造函数，与类同名，无返回声明，需要初始化对象属性，可以重载，本质是静态函数。
	
	public Person(String id, String name, String birthday, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.gender = gender;
		count++;
	}

	public Person(String id, String name, String birthday, String gender, Car car) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.gender = gender;
		this.car = car;
		count++;
	}

	public void eat(String food) {
		System.out.println(name + "吃了" + food);
	}
	
	public void sleep(int hour) {
		System.out.println(name + "睡了" + hour + "小时");
	}
	
	public void travel(String place) {
		System.out.println(name + "去" + place);
		if(car != null)
			car.drive(place);
		else
			System.out.println(name + "走路去" + place);
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", birthday=" + birthday + ", gender=" + gender + "]";
	}
	
	public static int getCount() {
		System.out.println("共有" + count + "个人");
		return count;
	}
}
