package list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>(); // ����Ʈ ����
		
		list.add("������");
		list.add("¯�̴�1");
		list.add("¯�̴�2");
		list.add("¯�̴�3");
		list.add("¯�̴�4");
		list.add("¯�̴�5");
		list.add("¯�̴�6");
		list.add("¯�̴�7");
		
		int index = 0;
		for(String argument : list){
			System.out.println("����Ʈ �ȿ� �ִ� ���� ����==> "+argument);
			System.out.println("����Ʈ �ε���===> "+index);
			index++;
		}
		list.remove(3);
		System.out.println("==============================");
		
		index = 0;
		for(String argument : list){
			System.out.println("����Ʈ �ȿ� �ִ� ���� ����==> "+argument);
			System.out.println("����Ʈ �ε���===> "+index);
			index++;
		}
		
		System.out.println("==============��ü ����Ʈ�� �ֱ�================");
		
		
		Person p1 = new Person("������","28","�̸���","������");
		Person p2 = new Person("�̵���","28","�̸���","���");
		Person p3 = new Person("������","28","�̸���","�ʸ�ũ");
		Person p4 = new Person("������","26","�̸���","���");
		Person p5 = new Person("�̳���","27","�̸���","����");
		Person p6 = new Person("����","27","�̸���","�ŵ���");
		
		List<Person> personList = new ArrayList<Person>();
		
		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		personList.add(p4);
		personList.add(p5);
		personList.add(p6);
		
		for(Person person : personList){
			System.out.println(person);
		}
		
	}

}

class Person{
	private String name;
	private String age;
	private String email;
	private String job;
	
	public Person(){}

	public Person(String name, String age, String email, String job) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.job = job;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", email=" + email + ", job=" + job + "]";
	}
	
	
}



















