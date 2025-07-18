package sec01.homework;

import java.util.Scanner;

public class Homework5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("번호를 입력하여 주십시오.");
		int a =sc.nextInt();
		if (a == 1) {
			System.out.println("스쿼트 운동 시간 입니다.");
		}else if (a == 2){
			System.out.println("데드리프트 운동 시간 입니다.");
		}else if (a == 3){
			System.out.println("벤치 프레스 운동 시간 입니다.");
		}else if (a == 4){
			System.out.println("풀업 운동 시간 입니다.");
		}else {
			System.out.println("오늘도 수고하셨습니다.");
		}
	}

}
