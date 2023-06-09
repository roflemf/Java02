/* add()매서드 첫번째, 두번째 매개변수 자료형은 기본타입이어서 값이 전달되고, 
 * 세번째 매개변수는 배열 즉, 참조타입이어서 배열주소가 전달되어서 (배열주소가 공유되기 때문에)값을 공유할 수 있다.
 * 
 */
class MtObj01{
	int add(int a, int b) {
		return a+b;
	}
	
	void add(int a, int b, int[] result) {
		result[0] = a + b; // 8
	}// 전달인자 개수를 다르게 한 매서드 오버로딩
}
public class ObjTest01 {
	public static void main(String[] args) {
		MtObj01 mt  = new MtObj01();
		
		int result = mt.add(3, 5);
		System.out.println("result = "+ result); //8
		
		int[] result2 = {0};// result2배열의 첫번째 원소값을 0으로 초기화
		mt.add(3,5,result2); // 첫번째 두번째 인자값으로는 값이 전달, 세번째 배열은 주소값이 전달됌.
		System.out.println("result2[0] = "+result2[0]);//8 => 배열 주소값을 공유해서 8이 됌
		
	}
}
