package sec02.exam10;

import java.util.Scanner;

public class AssignmentOperatorExample {

	public static void main(String[] args) {
		int result = 0;

		result += 10; // result = result + 10
		System.out.println("result = " + result);
		
		result -= 5; // result = result - 5
		System.out.println("result = " + result);
		
		result *= 3; // result = result * 3
		System.out.println("result = " + result);
		
		result /= 5; // result = result / 5
		System.out.println("result = " + result);
		
		result %= 3; // result = result % 3
		System.out.println("result = " + result);

//		금액을 입력받아 500원, 100원, 50원, 10원, 1원 동전으로 변경하려고 합니다.
//		최소 필요한 동전의 개수를 출력하는 프로그램을 구현하시오.
//
//		[입력]
//		5640
//
//		[출력]
//		500원: 11개
//		100원: 1개
//		50원: 0개
//		10원: 4개
//		1원: 0개	
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하세요: ");
		int money = sc.nextInt();
		System.out.println("500원: " + money / 500);
		money = money % 500;
		System.out.println("100원: "+ money / 100 );
		money = money % 100;
		System.out.println("100원: "+ money / 50 );
		money = money % 50;
		System.out.println("100원: "+ money / 10);
		money = money % 10;
		System.out.println("100원: "+ money / 1 );
		
		
//		
		System.out.println("금액을 입력하세요: ");
		int amount = sc.nextInt();
		
		int coin500 = amount / 500;
		amount %= 500;
		int coin100 = amount / 100;
		amount %= 100;
		int coin50 = amount / 50;
		amount %= 50;
		int coin10 = amount / 10;
		amount %= 10;
		int coin1 = amount;
		
		System.out.println("500원: " + coin500);
		System.out.println("100원: " + coin100);
		System.out.println("50원: " + coin50);
		System.out.println("10원: " + coin10);
		System.out.println("1원: " + coin1);
		
		
		
		 
		
		
		
		
		
		
		
		

	}

}
