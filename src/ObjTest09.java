/*
 * 클래스 소속의 인스턴스 변수명과 메서드(생성자) 소속의 전달인자 명이 같을 때는 인스턴스 변수명 앞에 this.을 붙여서 구분해야
 * 값이 저장된다.
 */

class GuestBook09{
	private String writer; // 글쓴이
	private String title; // 글제목
	private String content; // 글내용


	public GuestBook09() {} // 기본생성자

	public GuestBook09(String writer, String title, String content) {
		this.writer= writer;
		this.title = title;
		this.content = content;
	}//생성자 오버로딩

	public void setTitle(String title) {
		this.title=title;
	}// setter() 값 저장 메서드

	public void printGuestBook() {
		System.out.println("글쓴이 : "+writer + ", 글제목 : " + title + ", 글내용" + content);
	}// 사용자 정의 메서드

}
public class ObjTest09 {
	public static void main(String[] args) {
		GuestBook09 guest = new GuestBook09("신사임당님", "방명록 제목입니다", "방명록 내용입니다");
		guest.printGuestBook();
		guest.setTitle("두번째 방명록 제목입니다");
		guest.printGuestBook();






	}

}
