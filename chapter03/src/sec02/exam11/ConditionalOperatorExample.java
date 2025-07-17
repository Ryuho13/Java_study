package sec02.exam11;

import java.util.Scanner;

public class ConditionalOperatorExample {

	public static void main(String[] args) {
		int score = 85;
		
		char grade = (score > 90) ? 'A': ((score > 80)? 'B':'C');
		System.out.println(score + "점은" + grade + "등급입니다.");
		
		
		// Quiz
//		0~100사이의 점수를 입력받아
//		점수가 60점 이상이면 "합격",
//		60점 미만인 경우 "불합격"을 출력하는 프로그램을 구현하시오.
//		단 음수이거나 100이 넘는 점수는 "점수입력오류"로 출력한다.
//
//		[입력] [출력]
//		 85 => 합격
//		 50 => 불합격
//		-10 => 점수입력오류
		
		Scanner sc = new Scanner(System.in);
		int scor2 = sc.nextInt();
		String grad2 = (scor2>100||scor2<0)
				?"점수입력 오류" :((scor2 >=60)
						? "합격" :(scor2 <60)
								? "불합격":"");
		System.out.println(grad2);   
		
		// if 문
		int scor = sc.nextInt();
		String grad;
		if(scor>100||scor<0) {
			grad = "점수입력 오류";
	    }else if (scor >=60) {
	    	grad = "합격";	    
	    }else {
	    	grad = "불합격";
	    }
			System.out.println(grad);
			
			
			
			
			
			

	
	
	
	
	
	
	
	
	}
		
		

		
		
	}


