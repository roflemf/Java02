/* 클래스 초기화블록과 인스턴스 초기화 블록
 * 
 */
public class ObjTest11 { //객체=클래스
	public int i = 10;
	
	public ObjTest11(){
		System.out.println("기본생성자");
	}
	
	static {
		System.out.println("static{}");
	}
	/* static{}을 클래스 초기화 블록이라고 한다. 클래스 초기화 블록은 정적변수 즉 클래스변수 초기화 
	 * static 키워드로 정의된 변수를 정적변수 즉 클래스 변수라고 한다.
	 * 정적변수는 객체 생성없이 클래스로 직접접근 가능하다.
	 * 클래스 초기화 블록은 해당 클래스가 최초 로딩될 때 딱 한번만 수행된다.
	 */
	{
		System.out.println("인스턴스 초기화 블록");
	}
	/* {} 인스턴스 초기화 블록은 인스턴스 변수 초기화에 사용된다. 
	 * 인스턴스 초기화 블록은 객체가 생성될 때마다 수행되고, 생성자보다 먼저 호출한다. 
	 * 
	 */

//	static void print11() {
//		System.out.println("11");
//	}
		
	public static void main(String[] args) {
		
		new ObjTest11(); // 인스턴스 초기화 블록 먼저 호출 이후 생성자 호출
		new ObjTest11(); // 인스턴스 초기화 블록이나 객체 생성할때 마다 호출된다.
		
//		ObjTest11.print11();
	}

}
