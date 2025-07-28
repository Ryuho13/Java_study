package sec03.exam03.quiz;

public class InformalEmployee extends Employee{
	// 필드
	private int primaryPay;

	// 생성자
	public InformalEmployee(String name, String dept, int primaryPay) {// 왜 타입이?
		super("비정규직", name, dept);
		this.primaryPay = primaryPay;
	}

	// 메소드
	@Override
	public int getPay() {
		return primaryPay;
	}

	@Override
	public String getInfo() {
		return getType() + ", " + getName() + ", " + getDept() + ", " + primaryPay;
	}

	
	
	
}
	


