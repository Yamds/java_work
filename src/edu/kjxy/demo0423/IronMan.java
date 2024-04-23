package edu.kjxy.demo0423;

import edu.kjxy.demo0419.Person;

public class IronMan extends Person implements Flying, Worroir {

	private String energy; //能量源

	public IronMan() {
		super();
	}

	public IronMan(String idno, String name, String birthday, String gender, String energy) {
		super(idno, name, birthday, gender);
		this.setEnergy(energy);
	}

	@Override
	public void work(String something) {
		System.out.println(getName() + "的工作拯救地球和全人类：" + something);
		this.fly("火星");
		this.fight("灭霸");
	}

	public String getEnergy() {
		return energy;
	}

	public void setEnergy(String energy) {
		this.energy = energy;
	}
	
	@Override
	public void fly(String dest) {
		System.out.println("飞往"+dest);
	}

	@Override
	public void fight(String enemy) {
		System.out.println("打" + enemy);
	}
}
