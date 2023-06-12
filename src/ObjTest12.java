
public class ObjTest12 {
	static int[] arr = new int [10]; // 배열 크기가 10인 정적배열 arr생성
	
	static {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1); /*random()메서드는 0.0이상 1.0미만 사이의 실수 숫자 난수를 발생시킨다.
												 *여기에 *10하면 0.0이상 10.0 미만 사이 실수 숫자 난수(정해지지않은 수) 
												 *-> +1하면 1.0이상 11.0미만 
												 *-> (int)로 형변환하면 소수점 이하는 버리고 1이상 11미만 
												 *				즉, 1부터 10사이의 정수 숫자 난수가 발생
												 */
		}
	}//클래스 초기화 블록에서 정적변수 arr초기화
	public static void main(String[] args) {
		
		// 향상된 확장 for반복문으로 arr배열원소값 출력
		for (int k : arr) {
			System.out.println(" " + k);
		} 
		
	}

}
