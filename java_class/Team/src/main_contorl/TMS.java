package main_contorl;

import member.MemberList;
import team.TeamList;

public class TMS {
	   public static TeamList tL = new TeamList();
	   public static MemberList mL = new MemberList();
	public static void main(String[] args) {
	   MainMenu mm = new MainMenu();

	   
	   tL.init();
	   mL.init();
	   //tL.SearchTeambyId();
	   
	   
	   
	   while(true) {
	   switch (mm.issueMenu()) {
	case 1:// 학생 멤버 추가
		mL.addStudent();
		break;
	case 2:// 학생 멤버 목록 출력
		mL.showStudent();
		break;
	case 3:// 멘토 멤버 추가
	    mL.addMentor();
		break;
	case 4:// 멘토 맴버 목록 출력 
		mL.showMentor();
		break;	
	case 5://멤버 조회
	    mL.SearchMember();
		break;
	case 6:
	    mL.showData();
		break;
	case 7:
	    tL.addTeam();
		break;
	case 8:
	    tL.showData();
		break;
	case 9:
	    tL.teamMember();
		break;
	case 0:
		return;
	   }
	   }

	}


}
