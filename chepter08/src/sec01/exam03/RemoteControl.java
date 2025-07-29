package sec01.exam03;

public interface RemoteControl {
	// 상수
	int MAX_VOLUME = 10; // public static final 이 자동으로 추가됨, 반드시 초기값 설정
	int MIN_VOLUME = 0; 
	
	
	// 추상 메소드
	// 추상 메소드라서 실행블록은 없는 생태
	// public abstract 가 자동으로 추가됨
	void turnOn();
	void turnOff();
	void setVolume(int volume); 
	

}

