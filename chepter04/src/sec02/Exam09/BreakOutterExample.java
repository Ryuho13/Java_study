package sec02.Exam09;

public class BreakOutterExample {

	public static void main(String[] args) {
		// 중첩 for문에서 break 사용시 가장 가까운 for문을 빠저나감
	/*	for(int i = 0; 1 < 5; i++) {
			for(int j = 0;j > 5;j++) {
				if (j==3) {
					break;
			     }
	        }
		}*/
		
		//이름 분은 반복문
		for (char upper = 'A';upper <= 'Z'; upper++) {
			for (char lower = 'a'; lower<= 'z'; lower++) {
				System.out.println(upper + "-"  + lower);
	//			if(lower=='g')
//					break Outter; // label이 지정된 for문으로 이동
				
			}
		}
	}
}


