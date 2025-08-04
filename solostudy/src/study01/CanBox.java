package study01;

// 클래스는 하드웨어 껍데기 
// 필드는 껍데기 안에 필요한 요소 
// 메소드는 그안에 소프트 웨어적으로 움직이는 "구현체"

public class CanBox {// 자판기 
	private String can;
	private int price;

	//String, int, Boolean, shot, Long, double
	//List<String> famliys= new ArrayList();
	//famliys[0] = '류가영'
	// ['류가영']
	
	//Map<key, value> 책, 혼자공부하는자바
	//Map<String, List<String>> family = new Map();
	//family.set('가족', famliys )
	
	//List<String> f = family.get('가족')
	//시스아웃에 ['류가영']
	
	public CanBox(String can, int price) {
		super();
		this.can = can;
		this.price = price;
	}
	
	public CanBox(String can) {
		super();
		this.can = can;
			}
	
	public CanBox(int price) {
		super();
		this.price = price;
	}
	
	public String get(int price) {
		return this.can;
	}
	
	
	
}
