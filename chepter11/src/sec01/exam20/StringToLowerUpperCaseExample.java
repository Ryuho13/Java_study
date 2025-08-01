package sec01.exam20;

public class StringToLowerUpperCaseExample {
	
	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		
		System.out.println(str1.equals(str2));
		
		// 대소문자 상관없이 비교하고 싶을때
		// 방법 1
		String lowerSrt1 = str1.toLowerCase();
		String lowerSrt2 = str2.toLowerCase();
		System.out.println(lowerSrt1);
		System.out.println(lowerSrt2);
		System.out.println(lowerSrt1.equals(lowerSrt2));
		
		// 방법2 
		System.out.println(str1.equalsIgnoreCase(str2));
		// equalsIgnoreCase : 대소문자 비교없이 equals 비교
		
		
		
	}
}
