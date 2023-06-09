/* 반환타입이 기본자료형이 아닌 참조타입. 
 * 그러므로 주소값이 반환됌.
 */


class Data02{
	int x;
}

class Ref02{
	Data02 copy(Data02 d) { // Data02 d=d;  같은 객체 주소를 가리킨다.
		Data02 tmp = new Data02(); // tmp라는 새로운 객체주소를 생성
		tmp.x = d.x; // 값만 복사되고 tmp와 d는 다른객체주소를 가진다.

		return tmp; // tmp객체주소가 반환
	}
}

public class ObjTest02 {
	public static void main(String[] args) {
		
		Data02 d = new Data02();
		d.x = 10;
		
		Ref02 ref = new Ref02();
		Data02 d2 = ref.copy(d); // d2 = tmp가 된다. 결국 d2와 tmp는 같은 객체 주소를 가리킨다
		//결국 d와 d2는 서로 다른 객체주소를 가지고 값만 같다.
		
		System.out.println("d.x = "+d.x);//10
		System.out.println("d2.x = "+ d2.x); //10
	}

}

/*
 * Java01 - Test09참조
 * MyDate09 t = d; 주소복사
 * MyDate09 t.x = d.x; 값만 복사
 */

