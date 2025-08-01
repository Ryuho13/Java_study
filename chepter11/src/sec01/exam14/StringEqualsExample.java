package sec01.exam14;

public class StringEqualsExample {

	public static void main(String[] args) {
		String sreval1 = new String("김재현");
		String sreval2 = "김재현";
		String sreval3 = "김재현";
		
		if (sreval1 == sreval2) {
			System.out.println("같은 String 객체를 참조");
		}else {
			System.out.println("다른 String 객체를 참조");
		}
		if (sreval2 == sreval3) {
			System.out.println("같은 String 객체를 참조");
		}else {
			System.out.println("다른 String 객체를 참조");
		}
		
		if (sreval1.equals(sreval2)) {
			System.out.println("같은 문자열을 가짐");
		}else {
			System.out.println("다른 문자열을 가짐");
		}
		if (sreval2.equals(sreval3)) {
			System.out.println("같은 문자열을 가짐");
		}else {
			System.out.println("다른 문자열을 가짐");
		}
		
		
	}

}
