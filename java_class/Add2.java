package java_class;

import java.util.Scanner;

public class Add2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 0; 
		System.out.print("첫 번째 숫자를 입력하세요 : ");
	    x = sc.nextInt();
	    System.out.print("두 번째 숫자를 입력하세요 : ");
	    y = sc.nextInt();
	    
	    
	    int sum = x + y;
	    
	    System.out.println(sum);
	    sc.close();

	}

}
