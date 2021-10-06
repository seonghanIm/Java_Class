package java_class;

import java.util.Scanner;

class BankAccount{
	int accountNumber = 0;
	String owner;
	int balance = 0;
	
	void setAccountNumber(int number)
	{
		accountNumber = number;
	}
	void setOwner(String name)
	{
		owner = name;
		
	}
	void setbalance(int ba)
	{
		balance = ba;
		
	}
	
	int getAccountNumber()
	{
		return accountNumber;
	}
	
	String getOwner()
	{
		return owner;
	}
	int getbalance()
	{
		return balance;
	}
	
	void deposit(int money)
	{
		balance += money;
		System.out.println(money + "입금 남은금액 :" + balance);
	}
	
	void withdraw(int money)
	{
		balance -= money;
		System.out.println(money + "출금 남은금액 :" + balance);	
		
	}
	
	void transfer(int money)
	{
		balance -= money;
		System.out.println(money + "송금 남은금액 :" + balance);
	}
	
	
}


public class ch8Qz {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		BankAccount ac = new BankAccount();
	    
		System.out.print("계좌번호를 입력하세요 : ");
		ac.setAccountNumber(sc.nextInt());
		System.out.println("");
		
		System.out.print("이름을 입력하세요 : ");
		ac.setOwner(sc.next());
		System.out.println("");
		
		System.out.print("시작 balance : ");
		ac.setbalance(sc.nextInt());
		System.out.println("");
		
	
		
		int num = 0;
		while(true)
		{
		System.out.println("Main Menu");
		System.out.println(" ");
		System.out.println("---------------");
		System.out.println("1. 입금");
		System.out.println("2. 출금");
		System.out.println("3. 송금");
		System.out.println("4. 잔고조회");
		System.out.println("0. 종료");
		System.out.println("---------------");
		System.out.println(">> 선택?");
		num = sc.nextInt();
		
		if(num==1)
		{
			System.out.print("입금 금액을 입력하세요 : ");
			ac.deposit(sc.nextInt());
			System.out.println("");
		}
		else if(num==2)
		{
			System.out.print("출금 금액을 입력하헤세요 : ");

			ac.withdraw(sc.nextInt());
			if(ac.balance<0)
			{
				System.out.println("마이너스 계좌 불가");
				break;
			}
		}
		else if(num==3)
		{
			System.out.print("송금 계좌 : ");
		    int account = sc.nextInt();
		    System.out.println("");
		    if(account == 1002)
		    {
			System.out.println("송금 금액 : ");
			ac.transfer(sc.nextInt());
			if(ac.balance<0)
			{
				System.out.println("마이너스 계좌 불가");
			     break;
			}
		    }else System.out.println("계좌가 틀렸습니다. ");
					
		}else if(num == 4)
		{
			System.out.println(ac.getbalance());
		}else
		{
			break;
		}
		}

	}

}
