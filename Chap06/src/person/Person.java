package person;


// 이름(name)과 나이(age) 속성을 가짐
public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void print() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
	}

	public String fieldsToString() {
		return "name=" + name + ", age=" + age ;
	}

	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}


}
