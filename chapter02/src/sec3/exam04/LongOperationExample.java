package sec3.exam04;

public class LongOperationExample {

	public static void main(String[] args) {
		// 정수 타입의 산술 연산에서 하나라도 long 타입이면 long 타입으로 자동 변환
		byte x = 20;
		long y = 40;
//		int result = x + y; // byte가 long으로 변환됨, long + long
		long result = x + y; 
		System.out.println(result);
		
		
		byte val1 = 10;
		int val2 = 100;
		long val3 = 1000L;
		// byte -> int 로 변환후 int + int 이후 int가 long으로 변환 후 long + long으로 바뀜
		long result2 = val1 +val2 + val3;
		System.out.println(result2);
		
		
		
		

	}

}
