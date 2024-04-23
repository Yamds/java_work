package edu.kjxy.demo0419;

public class Computer {
	private String cid;
	private String brand;
	private String data;	//把电脑中的数据传给USB设备
	
	public Computer() {
		super();
	}

	public Computer(String cid, String brand, String data) {
		super();
		this.cid = cid;
		this.brand = brand;
		this.data = data;
	}

	public void copy(USB device)
	{
		device.conn();
		device.transfer(data);
		device.disconn();
	}
}
