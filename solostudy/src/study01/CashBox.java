package study01;

import java.util.Map;

//새마을금고
public class CashBox {

//	private String[] users; //회원 => key(배열) 
//	private Long[] moneys; //재산
	
	//['류호석', '류주연'] users
	//[100, 500] moneys
	
	private Map<String, Long> userInfo;
	private String user; //회원 => key(배열) 
	private Long money; //재산
	
	public void settingUser(String user) {
		this.user = user;
	}
	
	public void settingMoney(Long money) {
		this.money = money;
	}
	
	public void settingUserInfo(String user, Long money) {
		this.userInfo.put(user, money);
	}
	
	public void settingUserInfo(Map<String,Long> info) {
		this.userInfo = info;
	}
}
