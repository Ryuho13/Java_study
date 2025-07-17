package homework;

import java.util.Scanner;

public class Homework2 {
	/*가로 : 13.5
      세로 : 41.7
      면적 : 562.95
      둘레 : 110.4
*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float width = sc.nextFloat();
		float length = sc.nextFloat();
		System.out.println("면적 : " + width * length);
		System.out.println("둘레 : " + (width + length) * 2);
	}

}
