package homework;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
//		 Scanner로 문자열을 입력 받으세요.
//		 그 다음, 해당 문자열의 첫번째, 두번째, 세번째 문자를 출력해주는 시스템을 만들어주세요.
//		 문자열을 입력하세요 : apple
//		 첫번째 문자 : a
//		 두번째 문자 : p
//		 세번째 문자 : p   문자를 추출하는 메소드 charAt()

		
			Scanner sc = new Scanner(System.in);
			char ch = ' ';
		//	ch = sc.charAt();
			System.out.println(ch);
			 System.out.print("문자열을 입력하세요 : ");
		        String input =sc.nextLine();

		     if (input.length() >= 3) {
		     System.out.println("첫번째 문자 : " + input.charAt(0));
		     System.out.println("두번째 문자 : " + input.charAt(1));
		     System.out.println("세번째 문자 : " + input.charAt(2));
		     }
	}
}
