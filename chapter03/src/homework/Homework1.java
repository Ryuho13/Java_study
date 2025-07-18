package homework;

import java.util.Scanner;

public class Homework1 {
	public static void main(String[] args) {
		
/*		철수의 앵무새는 주인이 하는 말의 반대말만 하는 똑똑한 새에요.

		철수의 앵무새 처럼 우리의 프로그램도

		사용자 입력한 문자열이 “간다”와 같으면 “온다”라고 출력하고,

		그렇지 않은 경우에는 “간다”라고 출력하는 시스템을 만드세요.
*/		
		Scanner sc = new Scanner(System.in);
		String say = sc.next();
		String bird = say.equals("간다") 
				?"온다" :"" ;
		System.out.println(bird);
		
		
	}
    
}
