package member;

import java.util.Scanner;

import main_contorl.TMS;
import show.show;


public class MemberList extends TMS implements show {
	public Member Member[] = new Member[50];
	public int index=0;
	Scanner sc; 
	
	public void init()
	{
		Member[0] = new Student(index++,"홍학생",tL.tList[0].getTeam(),"소프트웨어");
		Member[1] = new Student(index++,"김학생",tL.tList[1].getTeam(),"게임공학");
		Member[2] = new Student(index++,"박학생",tL.tList[0].getTeam(),"컴퓨터 공학");
		Member[3] = new Mentor(index++, "홍멘토",tL.tList[0].getTeam(),"Happy co.");
		Member[4] = new Mentor(index++, "박멘토",tL.tList[2].getTeam(),"(주) 행복");
	
	}
	public void addStudent()
	{
		sc = new Scanner(System.in);
		int id = index + 1;
		System.out.println("<학생 멤버 추가>");
		System.out.println(" - ID  : " + id + " (자동 생성되는 ID)");
		System.out.print("- 이름 : ");
		String name = sc.next();
	
		System.out.print("- 전공 : ");
		String major = sc.next();
		tL.showData();
		System.out.print("Team ID : ");
		int TeamNum = sc.nextInt();
		System.out.println("");
		
		Member[index] = new Student(index,name,tL.tList[TeamNum-1].getTeam(),major);
		System.out.println(" => " + name +" : 학생을 추가했습니다."  );
		index++;
	}
    public void showStudent() {
    	System.out.println("<학생 멤버 목록>");
        System.out.println("-------------------------------------");
        System.out.println("ID        이름       Team       전공");
        System.out.println("-------------------------------------");
        
        for(int i=0;i<index;i++)
        {
        	if(Member[i] instanceof Student)
        	{
        	System.out.println(Member[i].toString());
        	}
        }
        System.out.println("-------------------------------------");
    }
    public void addMentor() {
    	sc = new Scanner(System.in);
		int id = index + 1;
		System.out.println("<멘토 멤버 추가>");
		System.out.println(" - ID  : " + id + " (자동 생성되는 ID)");
		System.out.print("- 이름 : ");
		String name = sc.next();
		System.out.print("- 회사 : ");
		String org = sc.next();
		tL.showData();
		System.out.print("Team ID : ");
		int TeamNum = sc.nextInt();
		System.out.println("");
		
		Member[index] = new Mentor(index,name,tL.tList[TeamNum-1].getTeam(),org);
		System.out.println(" => " + name +" : 멘토를 추가했습니다."  );
		index++;
    }
    public void showMentor() {
    	System.out.println("<멘토 멤버 목록>");
        System.out.println("-------------------------------------");
        System.out.println("ID        이름       Team       회사");
        System.out.println("-------------------------------------");
        
        for(int i=0;i<index;i++)
        {
        	if(Member[i] instanceof Mentor)
        	{
        	System.out.println(Member[i].toString());
        	}
        }
        System.out.println("-------------------------------------");
    }
    public void SearchMember() {
    	sc = new Scanner(System.in);
    	System.out.print("- 이름 : ");
    	String name = sc.next();
    	System.out.println("<찾은 멤버>");
        System.out.println("-----------------------------------------------");
        System.out.println("구분      ID        이름       Team       전공/회사");
        System.out.println("-----------------------------------------------");
    	for(int i=0;i<index;i++)
    	{
    		String SorM = "";
    		if(Member[i] instanceof Student)
    		{
    			SorM = "학생";
    		}
    		else
    		{
    			SorM = "멘토";
    		}
    		if(Member[i].name.equals(name)){
    		    System.out.print(SorM + "     ");
    			System.out.println(Member[i].toString());
    		}
    	}
    	 System.out.println("-----------------------------------------------");
    }
    
    public void showData() {
    	System.out.println("모든 멤버 출력");
       	sc = new Scanner(System.in);
        System.out.println("------------------------------------------------------------");
        System.out.println("구분      ID         이름           Team             전공/회사");
        System.out.println("------------------------------------------------------------");
    	for(int i=0;i<index;i++)
    	{
    		String SorM = "";
    		if(Member[i] instanceof Student)
    		{
    			SorM = "학생";
    		}
    		else
    		{
    			SorM = "멘토";
    		}
    		    System.out.print(SorM + "     ");
    			System.out.println(Member[i].toString());
    	}
    	System.out.println("------------------------------------------------------------");
    }
}
