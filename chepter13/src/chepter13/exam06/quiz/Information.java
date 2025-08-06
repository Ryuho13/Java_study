package chepter13.exam06.quiz;

public class Information {
	private String phoine;
	private int salary;
	public Information(String phoine, int salary) {
		this.phoine = phoine;
		this.salary = salary;
		
	}
	public String getPhoine() {
		return phoine;
	}
	public void setPhoine(String phoine) {
		this.phoine = phoine;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return  "[전화번호= " + getPhoine() + "월급= " +getSalary() + "]"; 
	}
	
	

}
