package group;

import java.util.Scanner;

public class GroupManager {
	private Group[] garr;
	private static int index;
	Scanner sc;
	public GroupManager(int n) {
		garr = new Group[n*2];
	
	}
	
	
	public void init() {
	    garr[0] = new Group("가족");
	    garr[1] = new Group("과친구");
	    garr[2] = new Group("중딩 친구");
	    garr[3] = new Group("고딩 친구");
	    garr[4] = new Group("구매사");
	    garr[5] = new Group("고객사");
	    garr[6] = new Group("대리점");
	    
	    index = 7;
	    
	    
	    
	}
	
	 public void addGroup(String title) {
		 garr[index++] = new Group(title);
	 }
	 
	 public void addGroup()
	 {
		 System.out.println("<<연락처 그룹 정보 입력>>");
		 System.out.println("- 그룹 ID : " + ++index);
		 System.out.print("- 이름 : ");
		 sc = new Scanner(System.in);
		 String title = sc.next();
		 garr[index-1] = new Group(title);
		 System.out.println("");
		 System.out.println(">> " + title +  " : 그룹 추가 성공...");
	 }
	 
	 public void showGroup()
	 {
		 System.out.println("-------------------");
		 System.out.println("Group ID    Group name");
		 System.out.println("-------------------");
		 
		 for(int i = 0;i<index;i++)
		 {
			 System.out.println(garr[i].getId() + "     " + garr[i].getGroupName());
		 }
		 
		 System.out.println("-------------------");
	 }
	 
	 public String returnTitle(int id)
	 {
		 if(id == 1)
		 {
			 return garr[1].getGroupName();
		 }else
		 {
		 return garr[id-1].getGroupName();
		 }
	 }

}
