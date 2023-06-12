/*
 * this키워드를 사용해야 하는 이유)
 * 클래스 소속의 멤버변수 중 인스턴스 변수(속성)와 메서드(생성자) 소속의 매개변수(전달인자) 이름이 같은 경우 
 * 인스턴스 변수명 앞에 this.을 사용하지 않으면 자바는 어느것이 변수인지, 전달인자인지 구분을 못해서 값을 저장 못함
 */

class MyDate08{
	/* 클래스 소속의 멤버변수 기본 초기값 종료)
	 * 	int 타입 변수 : 0
	 * 	참조 타입 변수 : null
	 * 	boolean 타입 변수 : false
	 * 	double 타입 변수 : 0.0
	 * 
	 */
	private int year;
	private int month;
	private int date;
	
	public MyDate08() {} // 매개변수가 없는 기본생성자
	
	public MyDate08(int year, int month, int date) {
		year = year; //년도값 저장못함
		this.month = month;
		this.date = date;
		
	}//생성자 오버로딩
	
	public void pr() {
		System.out.println(year+"년"+month + "월"+date + "일");
	}
}
public class ObjTest08 {
	public static void main(String[] args) {
		MyDate08 md = new MyDate08(2023,6,12);
		md.pr();
	}

}
