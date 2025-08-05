package chepter13.exam04.Quiz;

import java.util.Objects;

public class Equipment {
	private String name;
	private int pricePerDay;
	public Equipment(String name, int pricePerDay) {
		this.name = name;
		this.pricePerDay = pricePerDay;
	}
	@Override
	public String toString() {
		return "- " + name + ": " + pricePerDay + "원";
	}
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (!(obj instanceof Equipment)) return false;
		
		Equipment other = (Equipment) obj;
		return Objects.equals (name , other.name);
	}
	public int hashCode() {
	    return Objects.hash(name);
	    
	
	
	
	
	}

}
