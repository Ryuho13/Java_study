package sec01.quiz;
//Quiz
//반 전체 학생이 몇 명인지 입력을 받아 배열을 만들고,
//우리반 학생들 이름을 입력받아서 모두의 이름을 배열에 추가합니다.
//전체 학생 중에서 오늘 커피 쏠 사람을 랜덤으로 뽑으려고 해요.
//Math.random()을 활용해서 학생 한 명을 추출하여 출력하세요.

import java.awt.RenderingHints.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Quiz4 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Map<String, String> map = new HashMap<>();
		System.out.println("학생의 인원을 입력하여 주세요.");
		int n = sc.nextInt();
		 sc.nextLine();

		for (int i = 0; i < n; i++) {
					System.out.println((i+1) + "번째 학생 이름: ");
					String value = sc.nextLine();
					 
					String key = ""+i;
					map.put(key, value);
				}
		  int num = (int) (Math.random() * n);
		  String a = String.valueOf(num);
		  String b = map.get(a);
		  System.out.println(b);
		  
		
		
		
		
		
		
//		System.out.println("학생의 인원을 입력하여 주세요.");
//		int num = sc.nextInt();
//		String[]str = new String[num];
//		
//		for (int i = 0; i < num ; i++) {
//			System.out.println((i + 1)+ "번째학생의 이름을 입력하여 주세요.");
//			String name = sc.next();
//			str[i] = name;
//		}
//		int x = (int) (Math.random() * num);
//		System.out.println(str[x]);
		
		
		
	}

	

}
