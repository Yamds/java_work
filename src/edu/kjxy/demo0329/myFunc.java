package edu.kjxy.demo0329;

public class myFunc {

	public static int[] findMaxMin(int... data) {
		if(data == null || data.length == 0)
			throw new RuntimeException("参数个数为0，无法处理。"); // 抛出错误
		int max = data[0];
		int min = data[0];
		for(int i = 0; i < data.length; i++) {
			if(data[i] > max)
				max = data[i];
			if(data[i] < min)
				min = data[i];
		}
		int[] val = {min, max};
		return val;
	}
	
	public static int squ(int n) {
		return n*n;
	}
}