/* 13장. 생성자 pdf No. 19 1번문제
 * 전달인자 개수가 다른 생성자 오버로딩
 */

class Animal{
	String name;
	int age; // 멤버변수 2개 선언 -> 인스턴스 변수


	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}// 생성자 오버로딩


	public void show() {
		System.out.println(name + "은(는)" + age + "살 입니다");
	}// 사용자 정의 메서드
}

public class Ex13_01 {
	public static void main(String[] args) {
		/* 1. Animal 클래스에 생성자를 추가하시오. (Ex13_01.java) 
			class Animal{
			String name; 
			int age; 
			public void show( ){ 
			System.out.println( name + "는(은) " + age + " 살입니다."); 
			} 
			}
			public class Ex13_01{
			public static void main(String[] args) { 
			Animal a1=new Animal("원숭이", 26); 
			a1.show( ); 
			} 
			} [결과] 
			원숭이는(은) 26 살입니다.
		 * 
		 */

		Animal a01 = new Animal("원숭이", 26); //전달인자 2개짜리 오버로딩 된 생성자를 호출
		a01.show();
	}
}

