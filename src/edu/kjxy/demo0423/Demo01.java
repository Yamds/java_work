package edu.kjxy.demo0423;

import edu.kjxy.demo0419.Person;

public class Demo01 {
	public static void main(String[] args) {
		
		IronMan im = new IronMan("65632132", "TonyStark", "2000-09-09","��","ҿԪ��");
		
		im.work("�ֿ���Ե�����");

		Person imm = new IronMan("12345", "Tony", "2000-09-09","��","ҿԪ��");

		imm.work("�ֿ���Ե�����");
		if(imm instanceof IronMan m) {
			m.fly("����");
		}
	}
}
