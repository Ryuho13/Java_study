package sec03.exam03.quiz;

public abstract class Employee {
	// 필드 
	private String type;
	private String name;
	private String dept;
	
	// 생성자
	 public Employee(String type, String name, String dept) {
	        this.type = type;
	        this.name = name;
	        this.dept = dept;
	   }
	 
	 public String getType() {
	        return type;
	    }
	    public String getName() {
	        return name;
	    }
	    public String getDept() {
	        return dept;
	    }
	
	
	
	// 메소드
	public abstract int getPay();
	public abstract String getInfo();

}
