package edu.kjxy.demo0416;

public class Student extends Person {

	private String sno;	//ѧ��
		
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
		System.out.println("ѧ���Ĺ�����ѧϰ��");
		//System.out.println(this.sno + "," + super.idno + ", " + super.getName() + "����ѧϰ" + something);
	}
	
	public void practise(String company) {
		this.work("��ҵָ��");
		System.out.println(this.sno + "��" + company + "ʵϰ");
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", toString()=" + super.toString() + "]";
	}
		
}
