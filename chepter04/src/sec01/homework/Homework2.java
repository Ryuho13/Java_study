package sec01.homework;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("월 을 입력하여 주십시오.");
		int month = sc.nextInt();
		System.out.println("기온 을 입력하여 주십시오.");
		int temp = sc.nextInt();
		
		
		if(month >= 3 && month <= 5) {
			System.out.println("봄");
	    }else if (month >= 6 && month <= 8) {
	    	System.out.println("여름");
		}else if (month >= 9 && month <= 11) {
			System.out.println("가을");
		}else if (month == 12 || month == 1 || month == 2) {
			System.out.println("겨울");
		}else {
			 System.out.println("해당 계절은 없습니다.");
		}
		if (temp < -14) {
			 System.out.println("한파 경보");
		}else if (temp <= -12) {
			 System.out.println("한파 주의보");
		}else if (temp >= 35) {
			 System.out.println("폭염 경보");
		}else if (temp >= 33) {
			System.out.println("폭염 주의보");
		}else {
			System.out.println();
		}
		

	}

}

