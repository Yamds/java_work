package edu.kjxy.demo0419;

public class Phone implements USB{
	private String pid;
	private String brand;
	
	public Phone() {
		super();
	}
	
	public Phone(String pid, String brand) {
		super();
		this.pid = pid;
		this.brand = brand;
	}

	@Override
	public void conn() {
		System.out.println(pid+brand+"���ӳɹ�");
	}
	
	@Override
	public void transfer(String data) {
		System.out.println(pid+brand+"�������ݣ�" + data);
	}
	
	@Override
	public void disconn() {
		System.out.println(pid+brand+"�Ͽ��ɹ�");
	}
}
