package study01;

public class Park {

	//5개의 연령 = 3살 미만, 3 ~ 12세 , 13 ~ 18, 19 ~ 64, 65<
	//연령 1개에 요금 하나가 붙네 // free , 1만, 2, 3
	
	public String getMoney(int age) {
		
		if (3 > age ) {//3보다 작으니 3살 미만
		  return "당신은 무료입니다";
		} else if (13 > age) {
			return "당신은 1만원 입니다";
		} else if (19>age) {
			return "당신은 2만원 입니다.";
		}else if (65 > age) {
			return "당신은 3만원 입니다.";
		}else {
			return "당신은 무료입니다"; 
		}
	}
	
	
}
