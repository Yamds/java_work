package edu.kjxy.demo0416;

public class Person {
	private String idno = "公安没给";	//身份证号
	String name = "无名氏";	//类中的属性又称为成员变量
	protected String birthday = "找医院要";	
	public String gender = "自己看";	//性别 

	static int count = 0;	//隶属于类，而不是对象。但对象可以用。
	
	//空参构造函数始终保留
	public Person() {		
		super();
		count++;
	}

	public Person(String idno, String birthday, String gender) {
		super();
		this.idno = idno;
		this.birthday = birthday;
		this.gender = gender;
		count++;
	}

	//构造函数：与类同名，无返回声明，需要初始化对象属性，可以重载。本质是静态函数。
	public Person(String idno, String name, String birthday, String gender) {
		super();
		this.idno = idno;
		this.name = name;// 成员变量name = 参数name
		this.birthday = birthday;
		this.gender = gender;
		count++;
	}

	public void eat(String food)
	{
		System.out.println(name+"在吃"+food);
	}
	
	public void sleep(int hour)
	{
		System.out.println("现在有"+count+"个人");
		System.out.println(name+"睡"+hour+"小时");
	}
	
	public void work(String something)
	{
		System.out.println(this.idno + this.name + "在忙" + something);
	}

	@Override
	public String toString() {
		return "Person [idno=" + idno + ", name=" + name + ", birthday=" + birthday + ", gender=" + gender + "]";
	}
	
	public static int getCount()
	{
		System.out.println("共有"+count+"个人");
		return count;
	}

	public String getIdno() {
		return idno;
	}

	public void setIdno(String idno) {
		this.idno = idno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
