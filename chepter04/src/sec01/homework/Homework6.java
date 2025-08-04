package sec01.homework;

import java.util.Scanner;

public class Homework6 {
	/*소프트웨어설계 점수: 73
소프트웨어개발 점수: 51
데이터베이스구축 점수: 65
프로그래밍언어활용 점수: 80
정보시스템구축관리 점수: 42
합격을 축하합니다!*/
	public static void main(String[] args) {
		System.out.println("점수를 기입 하여 주십시오.");		
		Scanner sc = new Scanner(System.in);
		System.out.println("소프트웨어설계 점수: ");
		int a = sc.nextInt();
		System.out.println("소프트웨어개발 점수: ");
		int b = sc.nextInt();
		System.out.println("데이터베이스구축 점수: ");
		int c = sc.nextInt();
		System.out.println("프로그래밍언어활용 점수: ");
		int d = sc.nextInt();
		System.out.println("정보시스템구축관리 점수: ");
		int e = sc.nextInt();
		
		int total = a+b+c+d+e;
		int avg = total / 5 ;
		
		if (a < 40)System.out.println("소프트웨어설계 과락으로 불합격"); 
		else if(b < 40)System.out.println("소프트웨어개발 과락으로 불합격"); 
		else if(c < 40)System.out.println("데이터베이스구축 과락으로 불합격"); 
		else if(d < 40)System.out.println("프로그래밍언어활용 과락으로 불합격"); 
		else if(e < 40)System.out.println("정보시스템구축관리 과락으로 불학격"); 
		else if (total <60)System.out.println("평균점수 미달로 풀합격");
		else {System.out.println("합격을 축하합니다.");}
		
			
	
	
	
	}
	
	

	}
		
		
		
		
		
	


