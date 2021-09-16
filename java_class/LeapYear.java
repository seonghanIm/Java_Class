package java_class;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean isLeapYear;
		System.out.print("연도를 입력하세요 : ");
		int year = sc.nextInt();
		if(year%400 == 0)
		{
			isLeapYear = true;
		}else
		{
		isLeapYear = (year%4 == 0) && (year%100 != 0);
		}
		
		System.out.println("윤년 여부 : " + isLeapYear);
		
		sc.close();
	}

}
