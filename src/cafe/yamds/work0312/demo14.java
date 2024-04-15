package cafe.yamds.work0312;

import java.util.Scanner;

public class demo14 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE,sum=0;
		System.out.println("请输入任意个非零的数(0结束)");
		while(true)
		{
			int n=in.nextInt();
			if(n==0)
				break;
			
			sum+=n;
			
			if(n>max)
				max=n;
			if(n<min)
				min=n;
		}
		System.out.println("最大值："+max+"，最小值："+min);
	}

}
