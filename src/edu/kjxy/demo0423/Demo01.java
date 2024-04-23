package edu.kjxy.demo0423;

import edu.kjxy.demo0419.Person;

public class Demo01 {
	public static void main(String[] args) {
		
		IronMan im = new IronMan("65632132", "TonyStark", "2000-09-09","ÄĞ","Ò¿ÔªËØ");
		
		im.work("µÖ¿¹Ãğ°ÔµÄÈëÇÖ");

		Person imm = new IronMan("12345", "Tony", "2000-09-09","ÄĞ","Ò¿ÔªËØ");

		imm.work("µÖ¿¹Ãğ°ÔµÄÈëÇÖ");
		if(imm instanceof IronMan m) {
			m.fly("ÔÂÇò");
		}
	}
}
