package sec01.homework;

import java.util.Scanner;

public class Homework4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("오류코드를 입력하여 주십시오.");
		int er = sc.nextInt();
		
		switch (er) {
		case 400: 
			System.out.println("400: 잘못된 요청입니다.");
			break;
		case 404: 
			System.out.println("404: 요청하신 서비스를 찾을 수 없습니다.");
			break;
		case 500: 
			System.out.println("500: 처리 방버을 알 수 없는 문제가 발생했습니다.");
			break;
		case 503: 
			System.out.println("503: 일시적인 서버 오류가 발생하였습니다.");
			break;	
		default:
			System.out.println("그외: 알 수 없는 오류가 발생하였습니다.");
			break;
		}
		
		
	}

}
