package java_class;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MoneyExchange {

	public static void main(String[] args) {
		int won = 0; 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원화를 입력하세요 : ");
		won = sc.nextInt();
		DecimalFormat form = new DecimalFormat("#.####");
		System.out.println(form.format(won/1111.38));
		sc.close();

	}

}
