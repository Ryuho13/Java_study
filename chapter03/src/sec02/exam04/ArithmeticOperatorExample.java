package sec02.exam04;

import java.util.Scanner;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {
		//TODO: 할일 = window에 테스크에 서 확인가능
		
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2 ;
		System.out.println("result1 = " + result1);

		int result2 = v1 - v2 ;
		System.out.println("result2 = " + result2);
		
		int result3 = v1 * v2 ;
		System.out.println("result3 = " + result3);
		
		int result4 = v1 / v2 ;
		System.out.println("result4 = " + result4);
		
		int result5= v1 % v2 ;
		System.out.println("result5 = " + result5);
		// 주로 짝수,홀수, 배수를 확인 할때
		// 예) 9 % 3 == 0 이 나오면 3의 배수
		
		// 정확한 나누기 결과값을 얻으려면 double 변수로 선언하던가 아니면 타입 변환을 통해 가능
		double result6 = (double)v1 / v2;
		System.out.println("result = " + result6);
		
		// quiz
//		화면에서 2자리 정수를 입력받아 10의 자리 미만을 버리고 
//		출력하는 프로그램을 구현하시어
		
//		[입력] [출력]
//		55 => 50
//		60 => 60
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 자리 숫자를 입력하세요: ");
		int a = sc.nextInt();
		System.out.println((a / 10) * 10);
		
		System.out.println("두 자리 숫자를 입력하세요: ");
		int num = sc.nextInt();
		int resultnum = (num / 10) * 10;
		//int resultnum = num - (num%10);
		System.out.println(resultnum);
		
		
		System.out.println("두 자리 숫자를 입력하세요: ");
		int b = sc.nextInt();
		if (b / 10 != 0) {
		System.out.println((b/ 10) * 10 );
		
		}
		
		
	}

}
