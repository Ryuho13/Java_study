package study01;

import java.util.ArrayList;
import java.util.List;
//호석이가 만든 세탁기에는 밑에 항목들이 필요할 뿐이야 
public class WashBot { //세탁기 를 하드웨어
	private String cloth; //옷 
	private String pong;  //세제
	private List<String> options = new ArrayList(); // 기능
	
	public WashBot(List<String> options) { //WASHBOT을 사용할거면 최초에 무조건 옵션을 셋팅하게끔 강제했다.
		super();
		this.options = options;
	}
	
	//세탁을 하는 기능을 만들어보자
	// 세탁할땐 ,, 옷이랑 ,, 세제가 필요한데..
	public String wash(String cloth, String pong) {
		
		//만약에 내가 매개변수로 옷과 퐁퐁을 넘겨 받았지만 
		//내 옷, 세제 필드에 담기지 않았다면 나는 먼저 옷이랑 세제를 담고 세탁을 하라고 말하고 싶어 
		if (!this.validate()) {
			return "너 옷, 세제 확인해라";
		}
		
		return "세탁이 되었습니다.";
	}
	
	public String setCloth (String a) {
		this.cloth = a;
		return "옷이 담겼습니다.";
	}
	
	public String setPong (String b) {
		this.pong = b;
		return "세제가 담겼습니다.";
	}

	private boolean validate() {
	

		if (this.cloth == null) {
			return false;
		}
		
		if (this.pong == null) {
			return false;
		}
		
		return true;
	}
	
}
