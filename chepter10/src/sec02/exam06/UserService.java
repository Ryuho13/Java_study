package sec02.exam06;

import java.security.InvalidAlgorithmParameterException;

public class UserService {
	public void registerUser(int age) {
		if(age < 0 ) {
			//throw : 예외 발생 시키기
			throw new InvalidAgeExceptiom("나이는 0보다 작을수 없습니다.");
		    // 참고: 만약 InvalidAgeExceptiom 처럼 예외를 범용적으로 만들면
			// 메시지를 통해 무슨 오류인지 명학하게 표현할 수 있음
	}
		System.out.println("사용자 등록 완료  ("+ age + ")");
}
}	

