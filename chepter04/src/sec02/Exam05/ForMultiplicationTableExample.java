package sec02.Exam05;

public class ForMultiplicationTableExample {

	public static void main(String[] args) {
		// 구구단 출력하기
		//중첩 for문(여기서는 이중 for문)
		for(int m = 2; m<= 9; m++) {
			System.out.println("***" + m + "단" + "***");
			for(int j =1;j<=9;j++) {
				System.out.println(m + " x " + j + " = " + (m * j));
			}
			System.out.println();
			
		}
		
		// 참고: for 문 중첩시 퍼포먼스가 떨어짐
		// 삼중을 넘어가면 잘 안씀
	}

}
