package edu.kjxy.demo0329;

import java.util.Arrays;

public class demo01 {

	public static void main(String[] args) {
		int[] val1 = myFunc.findMaxMin(1,2,3,4,5,6,7,8);
		int[] val2 = myFunc.findMaxMin(5);
		System.out.println(Arrays.toString(val1));
		System.out.println(Arrays.toString(val2));
		
		int[] val3 = myFunc.findMaxMin(6,7);
		System.out.println(Arrays.toString(val3));
		
		System.out.println(myFunc.squ(5));
		
	}
	
	

}
