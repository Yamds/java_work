package edu.kjxy.demo0408;

public class Person {
	String id;	//身份证号
	String name;	// 姓名
	String birthday;	// 生日
	String gender;	// 性别
	
	public Person() {}
	
	public Person(String id, String birthday, String gender) {
		super();
		this.id = id;
		this.birthday = birthday;
		this.gender = gender;
	}

	// 构造函数，与类同名，无返回声明，需要初始化对象属性，可以重载，本质是静态函数。
	
	public Person(String id, String name, String birthday, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.gender = gender;
	}

	public void eat(String food) {
		System.out.println(name + "吃了" + food);
	}
	
	public void sleep(int hour) {
		System.out.println(name + "睡了" + hour + "小时");
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", birthday=" + birthday + ", gender=" + gender + "]";
	}
	
}
