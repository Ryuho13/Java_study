package sec02.exam02.quiz;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
			
		System.out.println("첫번쨰 숫자: ");
		System.out.println("두번쨰 숫자: ");
		System.out.println("합: " + calculator.add(x, y));
		System.out.println("곱:" + calculator.multiple(x, y));
		try {
		System.out.println("나누기: "+ calculator.divide(x, y));
		}catch (ArithmeticException e) {
			System.out.println("나누기 중 부적절한 연산이 발생했습니다.");
		}finally {
			System.out.println("마지막까지 잘 도착했어요!!");
		}
		
		
		
	}

}
