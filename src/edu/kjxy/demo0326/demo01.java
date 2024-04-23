package edu.kjxy.demo0326;

import java.util.Arrays;
import java.util.Iterator;

public class demo01 {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 9, 8, 7, 6};

		Arrays.sort(a);
		
		int[] b = a;
		for (int i = 0; i < b.length; i++) {
			b[i]++;	
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		int[] c = Arrays.copyOf(a, a.length);
		
		for (int i = 0; i < c.length; i++) {
			c[i]++;	
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(c));
		
		int[][] n = {{1,2,3},{4,5,6},{7,8,9}};
		for(int[] it : n) {
			for(int val : it) {
				System.out.print(val + " ");
			}
			System.out.println();
		}
	}

}
