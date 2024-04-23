package edu.kjxy.demo0423;

import edu.kjxy.demo0419.Person;

public class IronMan extends Person implements Flying, Worroir {

	private String energy; //����Դ

	public IronMan() {
		super();
	}

	public IronMan(String idno, String name, String birthday, String gender, String energy) {
		super(idno, name, birthday, gender);
		this.setEnergy(energy);
	}

	@Override
	public void work(String something) {
		System.out.println(getName() + "�Ĺ������ȵ����ȫ���ࣺ" + something);
		this.fly("����");
		this.fight("���");
	}

	public String getEnergy() {
		return energy;
	}

	public void setEnergy(String energy) {
		this.energy = energy;
	}
	
	@Override
	public void fly(String dest) {
		System.out.println("����"+dest);
	}

	@Override
	public void fight(String enemy) {
		System.out.println("��" + enemy);
	}
}
