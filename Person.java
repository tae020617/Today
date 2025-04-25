package person;

public class Person {
	/* 사람 객체를 만들어주는 클래스
	 * 필드(데이터) : 이름, 나이, 성별, 주소	 
	 * 매서드 (행위, 기능) : 걷는다, 잠을 잔다, 먹는다 */
	String name;
	int age;
	String gender;
	String address;
	
	public Person() {
		// 기본 생성자 : 코드를 작성하는 클래스명과 동일하게 생성자 이름 작성
	}
	public Person(String name, int age, String gender, String address) {
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.address=address;
	}
	
	public void walk() {
		System.out.println(name+"이(가) 걷는다");
	}
	public void sleep() {
		System.out.println(name+"이(가) 잔다");
	}
	public void eat() {
		System.out.println(name+"이(가) 먹는다");
	}
	
}
