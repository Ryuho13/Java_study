package sec02.Exam04;

public class ForRlootCounterExample {

	public static void main(String[] args) {
		//(참고) 잘못 작성된 for 예
		for (float x = 0.1f; x <= 1.0f; x += 0.1f) {
			System.out.println(x); // 10번 반복을 기대하지만 실제로는 9번 반복
			// 이유는? x에 0.1씩 더할떄 정확하게 0.1이 더해지는 것이 아님(0.1 보다 약간큼)
			
		}
		// 초기화식에 사용되는 변수는 정수 타입을 쓰는 게 좋음
		

	}

}
