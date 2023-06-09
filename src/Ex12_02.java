/*12장. 메서드 살피기. pdf의 No.20쪽의 2번문제
 * 2. 속성으로 메모리 용량과 회사명을 저장하는 변수를 갖는
 * Mp3 클래스를 설계하고 다음과 같은 결과가 나오도록 객체
 * 생성 후 메소드를 호출하시오.(Ex12_02.java) 
 */

class Mp3{
	private String comp; // 회사명
	private int size; // 메모리 용량
	
	public String getComp() { // 값반환 getter() 메서드
		return comp;
	}
	public void setComp(String comp) { // 값저장 setter() 메서드
		this.comp = comp;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
}//Mp3 클래스
public class Ex12_02 {

	public static void main(String[] args) {
		Mp3 mp = new Mp3();
		
		mp.setComp("갑을회사");
		mp.setSize(8);
		
		System.out.println("회사명 : "+ mp.getComp());
		System.out.println("메모리 용량 : "+ mp.getSize() + "G");

	}

}
