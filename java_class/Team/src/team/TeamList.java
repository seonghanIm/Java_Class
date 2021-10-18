package team;

import java.util.Scanner;


import member.Student;
import show.show;
import main_contorl.TMS;

public class TeamList extends TMS implements show {
	public Team []tList= new Team[50];
	int index;
	Scanner sc;
	
	public void init() {
		 tList[0] = new Team("아침이다" , 0);
		 tList[1] = new Team("점심먹고" , 1);
		 tList[2] = new Team("놀다가자" , 2);
		 tList[3] = new Team("꿈꾼다" , 3);
		 
		 index = 4;
	}

	
    public void SearchTeambyId() {
    	sc = new Scanner(System.in);
    	System.out.print(" - Team Id : ");
    	int id = sc.nextInt();
    	System.out.println("");
    	System.out.println("<찾은 Team>");
    	System.out.println("--------------------");
    	System.out.println("ID        Team 이름");
    	System.out.println("--------------------");
    	int nid = id-1;
    	System.out.println(tList[nid].toString());
    }
    
    public void showData() {
    	System.out.println("---------------------");
    	System.out.println("ID           Team 이름");
    	System.out.println("---------------------");
    	for(int i=0;i<index;i++)
    	{
    		System.out.println(tList[i].toString());
    	}
    	System.out.println("---------------------");
    }
    
    public void addTeam() {
    	int id = index+1;
    	sc = new Scanner(System.in);
    	System.out.println("<Team 추가>");
        System.out.println("- ID : " + id + "<----자동 생성된 ID");
        System.out.print("- 타이틀 : ");
        String title = sc.next();
        tList[index] = new Team(title,index);
        System.out.println(">> " + title+ "팀 : 팀을 추가하였습니다." );
        index++;
    }
   public void teamMember()
   {
	   showData();
	   sc = new Scanner(System.in);
	   System.out.print("- Team ID : ");
	   int sel = sc.nextInt();
	   System.out.println("<" +tList[sel-1].getTeam()+ " : 멤버 목록>");
	   System.out.println("-----------------------------------------");
	   System.out.println("구분    ID    이름    Team      전공/회사");
	   System.out.println("-----------------------------------------");
	   String SorM = "";
	   for(int i=0;i<super.mL.index;i++)
	   {
		   if(mL.Member[i] instanceof Student)
		   {
			   SorM = "학생";
		   }else
		   {
			   SorM = "멘토";
		   }
		   
		   if(mL.Member[i].tm.getTeam().equals(tList[sel-1].getTeam()))
		   {
			   System.out.println(SorM +"  "+ mL.Member[i].toString());
		   }
		   
	   }
	   System.out.println("-----------------------------------------");
   }

}
