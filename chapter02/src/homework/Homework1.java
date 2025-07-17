package homework;

import java.math.MathContext;
import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
//몸무게(kg) : 70.0
//		키(m) : 1.80
//		BMI 지수 : 21.6		공식은 몸무게(kg) / (키(m) * 키(m))
		Scanner sc = new Scanner(System.in);
		System.out.println("몸무게(kg): ");
		double weight = sc.nextDouble();
		
		System.out.println("키(m): ");
		double  height = sc.nextDouble();
		
		double bmi = weight  / (height * height);
		System.out.println("bmi 지수: " + bmi);
		System.out.printf("bmi 지수: %.1f\n", bmi);
		System.out.println("BMI 지수: " + (int)(bmi * 10) / 10.0);
		System.out.println("BMI지수: " + Math.floor(bmi * 10) / 10.0);

	}

}
