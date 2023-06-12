//정적변수와 인스턴스 변수, this()

class Document14{
	static int count = 0; // 정적변수
	String name; // 인스턴스 변수
	
	Document14(){
		this("제목없음"+ ++count); //같은 클래스내의 다른 생성자를 호출
	}
	

	Document14(String name){
		this.name = name;
		System.out.println("문서" + this.name+ "이(가) 생성됌.");
	}
}

public class ObjTest14 {
	public static void main(String[] args) {
		new Document14(); //기본생성자 호출
		new Document14(); 
		new Document14("자바.txt"); // 오버로딩 된 생성자 호출
		new Document14();
		
	}
}
