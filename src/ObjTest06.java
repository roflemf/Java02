/* 자바에서 생성자가 오버로딩이 되면 전달인자가 없는 기본생성자를 자바 컴파일러가 묵시적 제공을 하지 않는다.
 * 생성자가 오버로딩이 안되면 기본생성자를 묵시적 제공한다. (즉, 생략이 가능)
 */
class Board06{
	private String board_Name="홍길동"; // 글쓴이
	private String board_Title="게시판 제목입니다"; // 글제목
	private String board_Content="게시판 내용입니다"; // 글내용
	
	/* private Board06(){}
	 * 기본생성자가 생략됌
	 */
	
	public void board_print() {
		System.out.println("글쓴이 : "+ this.board_Name); // this.은 생략가능함
		System.out.println("글제목 : "+ this.board_Title); 
		System.out.println("글내용 : "+ this.board_Content); 
	}
}
public class ObjTest06 {
	public static void main(String[] args) {
		Board06 board = new Board06(); // new Board06(); 에 의해서 기본생성자 호출
		board.board_print(); // 객체명.메서드()
		
	}

}
