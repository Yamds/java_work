package edu.kjxy.demo0416;

public class Student extends Person {

	private String sno;	//学号
		
	public Student() {
		super();
	}
	
	public Student(String idno, String birthday, String gender, String sno) {
		super(idno, birthday, gender);
		this.sno = sno;
	}

	public Student(String idno, String name, String birthday, String gender, String sno) {
		this(idno, birthday, gender, sno);
		setName(name);
	}

	@Override
	public void work(String something)
	{
		System.out.println("学生的工作是学习。");
		//System.out.println(this.sno + "," + super.idno + ", " + super.getName() + "正在学习" + something);
	}
	
	public void practise(String company) {
		this.work("就业指导");
		System.out.println(this.sno + "在" + company + "实习");
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", toString()=" + super.toString() + "]";
	}
		
}
