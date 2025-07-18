package homework;

import java.util.Scanner;

public class Homework2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String num2 = ((num % 2) == 0)
				?"구슬의 개수는 짝수입니다" :
			          ((num % 2) != 0)
			    ?"구슬의 개수는 홀수 입니다" :"";
		System.out.println(num2);
		
		
	}

}
