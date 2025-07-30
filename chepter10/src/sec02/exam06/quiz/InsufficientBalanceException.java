package sec02.exam06.quiz;
//1. 사용자 정의 예외 클래스 InsufficientBalanceException을 정의하세요.
//일반 예외로 만듭니다.
//생성자에서 예외 메시지를 전달받아 부모 생성자에 넘깁니다.
public class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException(String mesage) {
		super(mesage);
	}
}
