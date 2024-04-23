package edu.kjxy.demo0416;

public class Person {
	private String idno = "����û��";	//���֤��
	String name = "������";	//���е������ֳ�Ϊ��Ա����
	protected String birthday = "��ҽԺҪ";	
	public String gender = "�Լ���";	//�Ա� 

	static int count = 0;	//�������࣬�����Ƕ��󡣵���������á�
	
	//�ղι��캯��ʼ�ձ���
	public Person() {		
		super();
		count++;
	}

	public Person(String idno, String birthday, String gender) {
		super();
		this.idno = idno;
		this.birthday = birthday;
		this.gender = gender;
		count++;
	}

	//���캯��������ͬ�����޷�����������Ҫ��ʼ���������ԣ��������ء������Ǿ�̬������
	public Person(String idno, String name, String birthday, String gender) {
		super();
		this.idno = idno;
		this.name = name;// ��Ա����name = ����name
		this.birthday = birthday;
		this.gender = gender;
		count++;
	}

	public void eat(String food)
	{
		System.out.println(name+"�ڳ�"+food);
	}
	
	public void sleep(int hour)
	{
		System.out.println("������"+count+"����");
		System.out.println(name+"˯"+hour+"Сʱ");
	}
	
	public void work(String something)
	{
		System.out.println(this.idno + this.name + "��æ" + something);
	}

	@Override
	public String toString() {
		return "Person [idno=" + idno + ", name=" + name + ", birthday=" + birthday + ", gender=" + gender + "]";
	}
	
	public static int getCount()
	{
		System.out.println("����"+count+"����");
		return count;
	}

	public String getIdno() {
		return idno;
	}

	public void setIdno(String idno) {
		this.idno = idno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
