package edu.kjxy.demo0416;

public class PersonDemo {
	public static void main(String[] args) {
		Person p1 = new Person();
		
		//System.out.println(p1.idno);
		
		//p1.idno = "420503324234";	//��װ�����Բ���ֱ�Ӷ�д
		p1.setIdno("420503324234");
		p1.setGender("��");
		p1.setName("������");
		
		System.out.println(p1.toString());
		
		System.out.println(p1.getIdno());
		System.out.println(p1.getName());
	}
}
