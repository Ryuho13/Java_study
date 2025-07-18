package sec01.homework;

import java.util.Scanner;

public class Homework3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 수를 기입하여 주십시오.");
		int a = sc.nextInt();
		System.out.println("2번째 수를 기입하여 주십시오.");
		int b = sc.nextInt();
		System.out.println("세번째 수를 기입하여 주십시오.");
		int c = sc.nextInt();
		
		int min = (a > b)?(a < c ? a : c) : (b < c ? b : c);
		
		System.out.println("가장 작은수는" + min + "입니다.");
		
		
		
	}

}
