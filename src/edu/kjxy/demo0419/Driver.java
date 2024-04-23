package edu.kjxy.demo0419;

public class Driver extends Person {
	
	private String dno;	//¼ÝÕÕºÅ

	public Driver() {
		super();
	}

	public Driver(String idno, String name, String birthday, String gender, String dno) {
		super(idno, name, birthday, gender);
		this.dno = dno;
	}

	@Override
	public void work(String something) {
		System.out.println(super.getName() + this.dno + "¿ª³µ" + something);		
	}

}
