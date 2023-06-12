/*	this() 의 기능)
 * 	같은 클래스 내에서 오버로딩 된 다른 생성자를 호출할 때 사용한다.
 */

class MyDate10{
	/* 클래스 소속의 멤버변수의 각 타입에 따른 기본값)
	 *  boolean : false
	 *  byte, short, int : 0
	 *  long : 0L
	 *  float : 0.0f
	 *  double : 0.0 또는 0.0d
	 *  참조타입 : null
	 * 
	 */
	private int year;  // 년도
	private int month;  // 월
	private int date;  // 일
	
	public MyDate10() { // 전달인자가 없는 기본생성자
		this(2023,2,1); //같은 클래스 내에서 다른 생성자를 호출
	}
	
	public MyDate10(int year, int month) {
		this(year,month, 10);
	}
	
	public MyDate10(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date =date;
	}// 생성자 오버로딩
	
	public void pr() {
		System.out.println(year + "년" + month + "월" + date + "일");
	}
}
public class ObjTest10 {
	public static void main(String[] args) {
		MyDate10 md = new MyDate10(); // 기본생성자 호출
		md.pr();
		MyDate10 md2 = new MyDate10(2023,3); // 전달인자 2개짜리 오버로딩된 생성자 호출
		md2.pr();
		MyDate10 md3 = new MyDate10(2023,6,10);
		md3.pr();
	}

}
