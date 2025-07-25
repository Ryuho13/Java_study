package sec01.exam04;

// 비행기의 일반적인 특성을 물려받고 초음속 비행기능만 추가
public class SupersonicAirplane extends Airplan{
	// 비행모드를 상수로 선언
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flymode = NORMAL;
	@Override
	public void fly() {
		if (flymode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		}else {
			System.out.println("일반비행합니다.");
		}// 위와 같이 작성해도 되지만 부모 메소드와 내용이 같다면 비효율적
		// Airplane 개체의 fly()메소드 호출
	    super.fly();
	    //주로 부모 메소드의 기능을 일부 유지(사용) 자식에서 확장하려 할 떄 사용
		
		
	}

}
