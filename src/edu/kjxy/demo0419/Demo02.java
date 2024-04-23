package edu.kjxy.demo0419;

public class Demo02 {
	public static void main(String[] args) {
		Computer c = new Computer("C001", "联想", "Java学习视频");
		
		Phone p = new Phone("P001", "华为");
		
		c.copy(p);
	}
}
