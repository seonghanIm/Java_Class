package java_class;

import java.util.Scanner;

public class Ch04Qz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	
		
	
		while(true)
		{
			System.out.print("섭씨 온도 C ? ");
			double C = sc.nextDouble();
			double F = (C * 9/5) + 32;
		    System.out.println("화씨 온도 F = " + F);
		}
		
		
		
	}

}
