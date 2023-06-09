//12장. 메서드 살피기.pdf의 No.19쪽의 1번문제
//1. p() 메소드를 오버로딩하여 두 int 변수와 두 double에 대해서 
//       각각 최대값을 구하는 메소드를 정의하시오. (Ex12_01.java)

class MtRef01{
	int p(int a, int b) {
		if(a > b) {
			return a;
		}else {
			return b;
		}
	}
	
	void p(double a, double b) {
		if(a > b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
		
	}//전달인자 타입이 다른 메서드 오버로딩
	
}
public class Ex12_01 {

	public static void main(String[] args) {
		MtRef01 mt = new MtRef01();
		int i = mt.p(100,50);
		System.out.println(i);
		
		mt.p(50.0,75.0);
		
		
	}

}
