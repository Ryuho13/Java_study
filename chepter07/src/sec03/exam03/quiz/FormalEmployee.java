package sec03.exam03.quiz;

public class FormalEmployee extends Employee{
	// 필드 
	private int empNo;
	private int salary;
	
	
	public FormalEmployee(String name, String dept, int salary,int empNo) {// 왜 타입이??
		super("정규직", name, dept);
		this.empNo = empNo;
		this.salary = salary;
	}
	
		
	
	//메소드
	
	
	@Override
	public int getPay() {
		return salary / 12;
	}
	@Override
	public String getInfo() {
		return getType() + ", " + getName() + ", " + getDept() + ", " + empNo + ", " + salary;

	}

}
