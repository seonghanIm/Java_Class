package main_contorl;

import java.util.Scanner;

public class MainMenu {
	int sel;
	Scanner sc;
	int issueMenu() {
		System.out.println("<<메인 메뉴>>");
	    System.out.println("1. 학생 멤버 추가");
	    System.out.println("2. 학생 멤버 목록 출력");
	    System.out.println("");
	    System.out.println("3. 멘토 멤버 추가");
	    System.out.println("4. 멘토 멤버 목록 출력");
	    System.out.println("");
	    System.out.println("5. 멤버 조회");
	    System.out.println("6. 전체 멤버 목록 출력");
	    System.out.println("");
	    System.out.println("7. Team 추가");
	    System.out.println("8. Team 목록 출력");
	    System.out.println("9. Team 별 멤버 목록 출력");
	
	    System.out.print("메뉴 번호? ");
	    sc = new Scanner(System.in);
	    sel = sc.nextInt();
		return sel;
	}


}
