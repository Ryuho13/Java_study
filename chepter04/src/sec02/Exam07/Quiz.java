package sec02.Exam07;

import java.text.BreakIterator;
import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		
		int sum = 0;
		int j = 1;
		while (j<=100) {
			if(j%2==1){
				sum+=j;
				
			}
			j++;
		}
		System.out.println(sum);

/*		int a = sc.nextInt();
		int b = 0;
		while(true) {
			
			
			System.out.println(b);
			break;
		}*/
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sun =0;
		while (num>0) {
			sun += num % 10; // 마지막 자리 수 더하기
			num /= 10; // 마지막 자리 제거
		}
	     System.out.println("각 자리수의 합: " + sun);
		
				

	}

}
