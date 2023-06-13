/* 13장. 생성자 pdf No. 20 2번문제
 * 생성자 오버로딩문제
 * 
 * 2. Product 클래스에 생성자를 추가하시오.(Ex13_02.java) 
	class Product{ 
	String name; 
	int price; 
	} 
	public class ConEx02 { 
	public static void main(String[] args) { 
	Product p1=new Product("웰치스", 700); 
	Product p2 =new Product("커피"); 
	Product p3 =new Product(500); 
	Product p4 =new Product( );
	System.out.println(p1.name + ", " + p1.price); 
	System.out.println(p2.name + ", " + p2.price); 
	System.out.println(p3.name + ", " + p3.price); 
	} 
	} 
	[결과] 
	웰치스, 700 
	커피, 800
	물, 500
 */
class Product{
	String name; // 상품명
	int price; // 상품가격
	
	public Product() {} // 생성자가 오버로딩이 되면 기본생성자가 묵시적 제공을 하지 않아서 명시적 코드로 정의
	
	public Product(int price) {
		this("물", price); // 같은 클래스내의 전달인자 개수가 다른 오버로딩 된 생성자 호출
	}

	public Product(String name) {
		this(name, 800); 
	}
	
	public Product(String name, int price) {
		this.name=name;
		this.price = price;
	
	}// 생성자 오버로딩
	
	public void print() {
		System.out.println(name +"," + price);
	}
	
}//Product class End


public class Ex13_02 {
	public static void main(String[] args) {
		
		Product p1 =new Product("웰치스", 700); //매개변수 두개짜리 생성자
		Product p2 =new Product("커피"); //매개변수 문자열 타입 생성자 
		Product p3 =new Product(500); //매개변수int타입 생성자
		Product p4 =new Product(); //전달인자 없는 기본생성자
		p1.print();
		p2.print();
		p3.print();

		
		
	
	}
}
