/* 생성자는 메서드의 일종이기 때문에 오버로딩이 가능하다
 * 
 */

class MyDate05{
	private int year;
	private int month;
	private int date;
	
	public MyDate05() { // 기본생성자
		this.year = 2023;
		this.month = 6;
		this.date = 1;
	}
	public MyDate05(int year, int month, int date) {
		this.year= year;
		this.month = month;
		this.date = date;
	}// 전달인자 개수가 다른 생성자 오버로딩
	
	public void pr() {
		System.out.println(year + "년" + month + "월" + date + "일");
	}// 사용자 정의 메서드
}
public class ObjTest05 {

	public static void main(String[] args) {
		MyDate05 md = new MyDate05(); // 기본생성자 호출
		md.pr();
		MyDate05 md2 = new MyDate05(2023,6,12); // 전달인자 3개짜리 오버로딩 된 생성자를 호출
		md2.pr();

	}

}
