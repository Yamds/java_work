package edu.kjxy.demo0419;

import edu.kjxy.demo0416.Student;

public class GraduateStudent extends Student {
	private int salary;	//�о����в���
	
	public GraduateStudent() {
		super();
	}

	public GraduateStudent(String idno, String name, String birthday, String gender, String sno, int salary) {
		super(idno, name, birthday, gender, sno);
		this.salary = salary;
	}

	public void writePaper(String content) {
		//System.out.println(super.name);
		System.out.println(super.birthday);
		System.out.println(super.getIdno() + "д���ģ�������" + content);
	}
}
