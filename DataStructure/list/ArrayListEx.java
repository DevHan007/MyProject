package list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>(); // 리스트 생성
		
		list.add("한정훈");
		list.add("짱이다1");
		list.add("짱이다2");
		list.add("짱이다3");
		list.add("짱이다4");
		list.add("짱이다5");
		list.add("짱이다6");
		list.add("짱이다7");
		
		int index = 0;
		for(String argument : list){
			System.out.println("리스트 안에 있는 값을 빼기==> "+argument);
			System.out.println("리스트 인덱스===> "+index);
			index++;
		}
		list.remove(3);
		System.out.println("==============================");
		
		index = 0;
		for(String argument : list){
			System.out.println("리스트 안에 있는 값을 빼기==> "+argument);
			System.out.println("리스트 인덱스===> "+index);
			index++;
		}
		
		System.out.println("==============객체 리스트에 넣기================");
		
		
		Person p1 = new Person("한정훈","28","이메일","에이핀");
		Person p2 = new Person("이동진","28","이메일","비디");
		Person p3 = new Person("벡영빈","28","이메일","필링크");
		Person p4 = new Person("한유진","26","이메일","비디");
		Person p5 = new Person("이남규","27","이메일","가산");
		Person p6 = new Person("심훈","27","이메일","신동아");
		
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



















