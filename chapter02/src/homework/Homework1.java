package homework;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
//몸무게(kg) : 70.0
//		키(m) : 1.80
//		BMI 지수 : 21.6		공식은 몸무게(kg) / (키(m) * 키(m))
		Scanner sc = new Scanner(System.in);
		float cm = sc.nextFloat();
		float kg = sc.nextFloat();
		System.out.println("BMI지수 :" + kg / ( cm* cm));

	}

}
