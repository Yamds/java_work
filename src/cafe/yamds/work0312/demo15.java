package cafe.yamds.work0312;

import java.util.Scanner;

public class demo15 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("请输入一个整数：");	
		int n=in.nextInt(),s=0,i;
		while(n!=0)
		{
			i=n%10;
			s=s*10+i;
			n=n/10;
		}
		System.out.print(s);
	}

}