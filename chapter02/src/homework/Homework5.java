package homework;

import java.util.Scanner;

public class Homework5 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("국어: ");
		 double  kor = sc.nextDouble();
		 
		 System.out.println("영어: ");
		 double  en = sc.nextDouble();
		 
		 System.out.println("수학: ");
		 double  math = sc.nextDouble();
		 
		 int total = (int) (kor + en + math);
		 int avg = total / 3;
		 
		 System.out.println("총점: " + total);
		 System.out.println("평균: " + avg);
		 
		 
		
	}
       
}
