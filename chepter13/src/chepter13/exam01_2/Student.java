package chepter13.exam01_2;

import java.util.Objects;
// Comparable
// 객체를 정렬할 수 있도록 비교 기준을 정의
public class Student implements Comparable<Student> {
	private String name;
	private int age;
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (!(obj instanceof Student)) return false;
		
		Student other = (Student) obj;
		return age == other.age && Objects.equals(name, other.name);
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Student other) {
		// 중요! compareTo()의 리턴값 의미 (오름차순을 기준으로 함)
		// 음수: this < other - this 가 앞에 온다
		// 양수: this > other - this 가 뒤에 온다
		// 0: this == other - 순서 유지
		// 즉, 양수이면 자리를 바꿔주고 음수 또는 0이면 자리를 바꾸지 않음
		
		// 나이 오름차순 
//		return age - other.age;
		
		// 나이 내림차순
		// 오름차순 결과의 반대로 구현. 즉, other의 값이 클 떄 자리 바꿈
//		return other.age - age;
		
		// 나이 오름차순을 비교 연산으로 구현 시 
		if (age< other.age) return-1;
		else if(age>other.age) return 1;
		else return 0;
		
		// 문자열은 연산자로 비교 불가능
		// String 클래스에 재정의 된 compareTo() 사용
		// 기준 문자열이 사전상 뒤면 자리 바꿈
		// 기준 문자열이 사전상 앞이면 그대로 유지
//		"김재현".compareTo("박민수"); -> 음수 -> 그대로 유지
//		return name.compareTo(other.name); // 오름차순
//		return other.name.compareTo(name); // 내림차순
		
		
		
		
		
			
		
		
	}

}
