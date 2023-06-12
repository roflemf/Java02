/* 생성자의 주된 기능은 클래스 소속 멤버변수 중 인스턴스 변수 초기화 기능이다.
 * 
 */

class Member04{
	private String member_id; // 회원 아이디
	private String member_name; // 회원 이름
	private String member_phone; // 폰 번호
	
	public Member04() { //전달인자가 없는 기본생성자
		this.member_id="abc56789";
		member_name = "홍길동"; //this.생략가능
		member_phone = "010-999-9999"; //생성자의 주된 기능인 인스턴스 변수 초기화
	}
	
	public void pr() {
		System.out.println("아이디 : "+member_id +", 회원이름 : "+ member_name+", 폰번호 : " + member_phone);
	}

}
public class ObjTest04 {
	public static void main(String[] args) {
		
		Member04 member = new Member04(); //new Member04(); 에 의해서 생성자를 호출
		member.pr();

	}

}
