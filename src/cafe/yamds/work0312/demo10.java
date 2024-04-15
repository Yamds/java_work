package cafe.yamds.work0312;

import java.util.Scanner;

public class demo10 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int t=0,b=0;
		System.out.println("请输入一个二进制数，空格隔开，非0或1结束输入！");
		while(true)
		{
			int n=in.nextInt();
			if(n!=0&&n!=1)
				break;
            t = t*2+n;
            b++;
		}	
		if(b==0)
			System.out.println("输入错误，没有二进制数！");
		else System.out.println("十进制数为："+t);
	}
}
