package java_class;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		double radius;
		 
		Scanner sc = new Scanner(System.in);
		
		
	   System.out.print("반지름을 입력하시오 : ");
	   radius = sc.nextDouble();
	   
	   System.out.println(3.14 * radius * radius);
	   sc.close();

	}

}
