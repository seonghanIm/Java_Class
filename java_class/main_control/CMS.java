package main_control;

import java.util.Scanner;
import cms.contact.*;
import cms.group.*;

class MainMenu{
	int IssueMenu()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("-----메뉴--------");
		System.out.println("1. 연락처 추가");
		System.out.println("2. 연락처 조회");
		System.out.println("3. 연락처 목록 출력");
		System.out.println("");
		System.out.println("0. 종료");
		System.out.println("----------------");
		System.out.print("선택 >> ");
		
		int num = sc.nextInt();
		System.out.println("");
		
		return num;
	}
}




public class CMS {

	public static void main(String[] args) {
		MainMenu mm = new MainMenu();
		ContactManager cm = new ContactManager(50);
		
		while(true)
		{
			switch(mm.IssueMenu()) {
			case 1:// 연락처 추가
			     cm.addContact();
			     break;
			case 2:// 연락처 조회 
				 cm.searchContact();
				 break;
			case 3:// 연락처 목록 출력
				cm.showAll();
				 break;
			case 0: // 종료
				return;
			default: 
				System.out.println(">> 선택 오류");
			}
		}
		
		

	}

}
