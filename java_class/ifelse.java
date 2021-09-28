package java_class;

import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("컵 사이즈? : ");
		int n = sc.nextInt();
		
		if(n<100)System.out.println("small");
		else if(100<=n&&n<200) System.out.println("medium");
		else if(n>=200) System.out.println("large");
	    
		
		sc.close();

	}

}
