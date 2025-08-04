package study01;

import java.util.HashMap;
import java.util.Map;

public class Sub {
	
	public static void main(String[] args) {
		//새자판기를 셋팅을 했고
		// 자판기에 음료랑 가격을 정하는법은 2가지다
		// 생성자, 메소드
		// 생성자는 무조건 새자판기를 셋팅할때 음료를 셋팅 할수 밖에 없게 만들기 위해 생성자를 쓰는거야 
		// 메소드는 무조건 새자판기를 셋팅할때 음료와 가격을 셋팅할 필요는없다 
		
		CanBox canBox = new CanBox("e");
		
		String can = canBox.get(2);
		
		System.out.println("can ?"+ can);
		
		CashBox user1 = new CashBox();
		user1.settingMoney(1L);
		user1.settingUser("호석");
		
		CashBox user2 = new CashBox();
		user1.settingMoney(3L);
		user1.settingUser("호석2");
		
		CashBox user3 = new CashBox();
		Map<String, Long> info = new HashMap();
		info.put("호석1", 2L);
		info.put("호석2", 2L);
		info.put("호석3", 2L);
		info.put("호석4", 2L);
		user3.settingUserInfo(info);
		
		
		 user3.settingUserInfo("호석1",3L);
		 user3.settingUserInfo("호석2",3L);
		 user3.settingUserInfo("호석3",3L);
		 user3.settingUserInfo("호석4",3L);
		 user3.settingUserInfo("호석5",3L);
		 
	}

}
