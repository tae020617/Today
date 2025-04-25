package person;

public class Main {

	public static void main(String[] args) {
		// 1. 기본 생성자를 이용하여 객체 생성
		// 객체의 필드값 초기화 : 내 정보
		Person p1 = new Person();
		p1.name = "임태영";
		p1.age = 24;
		p1.gender = "여";
		p1.address = "전라남도 화순군";

		System.out.println("내 정보 : " + p1.name + " " + p1.age + " " + p1.gender + " " + p1.address);

		// 2. 매개변수가 있는 생성자를 이용하여 객체 생성
		// 객체의 필드값 초기화ㅏ : 짝궁 정보
		Person p = new Person("정광원", 30, "남", "광주광역시 북구");

		System.out.println("짝꿍 정보 : " + p.name + " " + p.age + " " + p.gender + " " + p.address);

		p.eat();
		p.sleep();
		p.walk();
	}

}
