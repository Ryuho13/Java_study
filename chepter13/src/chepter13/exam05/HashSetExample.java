package chepter13.exam05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<Member>set = new HashSet<Member>();
		
		// 인스턴스는 다르지만 내부 테이터가 동일한경
		// 객체의 hashCode와 equals 를 기준으로 판단
		set.add(new Member("e김재현", 30));
		set.add(new Member("김재현", 30));// 동등객체
		
		set.remove(new Member("e김재현", 30));
		
		System.out.println(set);
		
		// 요소 정렬
		// Member 처럼 사용자 정의 객체끼리 비교할 경우 비교 불가능
		// 정렬 기준으로 어떤 값을 사용할지 결도로 구현해야함
		// => Member 클래스가 Comparable 인터페이스 구현
		
		Set<Member> members = new HashSet<Member>();
		members.add(new Member("김재현",30));
		members.add(new Member("이수진",25));
		members.add(new Member("박민수",40));
		
//		Quiz
//		1. set -> List 변환
		List<Member> memberList = new ArrayList<Member>(members);
		System.out.println(memberList);
		
		
		
//		2. 정렬(나이 오름 차수)
		Collections.sort( memberList);
		
		
		// 3. 출력(향상된 for문)
		for (Member m : memberList) {
		System.out.println(m.getName() + " - " + m.getAge());
				}
				
		// 다시 Set으로 변환(정렬된 순서 유지하려면 LinkedHashSet)
		Set<Member> sortedSet = new LinkedHashSet<Member>(memberList);
		for (Member m : sortedSet) {
			System.out.println(m.getName() + " - " + m.getAge());
		}
				
				
		// ArrayList의 요소에서 중복 제거하기
		List<Member> memList = new ArrayList<Member>();
		memList.add(new Member("김재현", 30));
		memList.add(new Member("이수진", 25));
		memList.add(new Member("박민수", 40));
		memList.add(new Member("김재현", 30)); // 중복
		memList.add(new Member("이수진", 25)); // 중복
				
		// Quiz
		Set<Member> memset = new LinkedHashSet<Member>(memList);
		List<Member> setList = new ArrayList<Member>(memset);
		for (Member member : setList) {
			System.out.println("\t"+setList);
			
		}
		
		
		
		
		
		
		

	}

}
