package edu.kjxy.demo0412;

import java.util.UUID;

public class demo03 {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			UUID id = UUID.randomUUID();
			System.out.println(id.toString() + "\t");
			
			String tmp = id.toString().replace("-", "");
			System.out.println(tmp + "\t");
			
			tmp = tmp.toUpperCase();
			System.out.println(tmp);
		}

	}

}
