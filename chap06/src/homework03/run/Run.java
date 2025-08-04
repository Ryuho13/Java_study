package homework03.run;

public class Run {
	public class Main {
	    public static void main(String[] args) {
	        Run processor = new Run();

	        String combined = processor.concatStrings("Hello, ", "World!");
	        System.out.println("합친 문자열: " + combined);

	        int result = processor.multiplyIfFirstBigger(3, 5); // 출력: 계산할 수 없습니다.
	        System.out.println("곱셈 결과: " + result);

	        boolean isSame = processor.isEqual("Java", "Java");
	        System.out.println("문자열 동일 여부: " + isSame);
	    }

}
}
