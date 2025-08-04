package study01;

import java.util.ArrayList;
import java.util.List;

public class RunWash {

	public static void main(String[] args) {
		// 세탁기 만들거야 
		// 뼈대 구성해놓은 본체 들고오자 
		
		//왜 생성자로 옵션에 기능을 강제하게 했느냐
		//호석이가 생각하는 세탁기는 , 행굼, 탈수, 세탁 기능이 되어야하는데 
		// 처음부터 무조건 세탁기에 옵션을 강제하지 않으면 원하는대로 작동핤수 없기때문에
		// 무조건 클래스를 초기화 를 할땐 생성자에 세탁기의 기능을 셋팅 하도록 한것 
		List<String>options = new ArrayList<>();
		options.add("세탁");
		options.add("행굼");		
		options.add("탈수");

		
		WashBot washBot = new WashBot(options);
		washBot.setCloth("티셔츠");
		washBot.setPong("다우니");
		System.out.println(washBot.wash("티셔츠", "다우니"));
		
		
		
		Park park = new Park();
		System.out.println(park.getMoney(70));
		
		StudyRoom room = new StudyRoom();
		Edu edu = new Edu();
//		edu.
//		room.setEdu();
		
	}

}
