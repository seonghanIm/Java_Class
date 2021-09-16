package java_class;

import java.util.Scanner;

public class BoxScanner {

	public static void main(String[] args) {
		double w;
		double h;
		double area;
		double preimeter;
		
		Scanner sc = new Scanner(System.in);
		
	    System.out.print("w를 입력하세요 : ");
		w = sc.nextDouble();
		System.out.print("h를 입력하세요 : ");
		h = sc.nextDouble();
		
		area = w * h; 
		preimeter = 2*(w+h);
		
		System.out.println("사각형의 넓이 : " + area);
		System.out.println("사각형의 둘레 : " + preimeter);
		
		sc.close();
		
		

	}	

}
