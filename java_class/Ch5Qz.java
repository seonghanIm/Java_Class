package java_class;

import java.util.Scanner;

public class Ch5Qz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] money = {50000,10000,5000,1000,500,100,50,10,1};
		System.out.print("물건값은?");
		int price=sc.nextInt();
		System.out.print("낸 금액은?");
		int pay = sc.nextInt(); 
		
		int change = pay - price;
		
		System.out.println("거스름 금액 : " + change + "원");
		
		for(int i=0;i<money.length;i++)
		{
			System.out.println(money[i] + "원 * " + change / money[i] + "장 = " + money[i]*(change/money[i]) + "원");
			change %=money[i];
		}
		
		
		sc.close();

	}

}
