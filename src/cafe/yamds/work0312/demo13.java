package cafe.yamds.work0312;

public class demo13 {
	public static void main(String[] args) {
		double i=100,s=100,t=0;
		for(int count=0;count<10;count++) {
			t=i;
			s=s+i;
			i=i/2;
		}
	System.out.println("共经过"+s+"米，"+"第10次反弹"+t+"米");
	}

}
