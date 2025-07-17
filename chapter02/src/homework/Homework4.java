package homework;

import java.util.Scanner;

public class Homework4 {
   public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("문자 입력하세요 : ");
	    	    
	    char inputCh = sc.nextLine().charAt(0);
	    
	    int uni = inputCh;
	    System.out.println(inputCh + "의 유니코드: " + uni);
	
	
	
}
}
