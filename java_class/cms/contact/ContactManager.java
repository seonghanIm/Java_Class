package cms.contact;

import java.util.Scanner;
import cms.group.*;



public class ContactManager {
	private Contact[] carr;
	private int index = 0;
	Scanner sc;
	
	public ContactManager(int n) {
		carr = new Contact[n];
		sc = new Scanner(System.in);
	}
	public void addContact() {
		System.out.println("<<연락처 정보입력>>");
		System.out.print(" - 이름 : ");
		String name = sc.nextLine();
		System.out.print(" - 이메일 : ");
	    String email = sc.nextLine();
	    System.out.print(" - 그룹 : ");
	    String groupString = sc.nextLine();
        GroupManager gm = new GroupManager(50);
        gm.addGroup(groupString);
	    carr[index++] = new Contact(name,email,groupString);
	    
	    System.out.println(groupString +" "+ name + " 추가 성공..");
	    System.out.println("");
		
	}
	
   public void showAll() {
	   System.out.println("----------------------");
	   System.out.println("이름     이메일     그룹");
	   System.out.println("----------------------");
	   for(int i=0;i<index;i++) {

		   System.out.println(carr[i].getName() + "   " + carr[i].getEmail() + "   " + carr[i].getGroup());
		   System.out.println("----------------------");
	   }
	   System.out.println("");
   }
   public void searchContact(){
	   System.out.print("검색이름 >>");
	   String name=sc.nextLine();
	   
	   for(int i=0;i<index;i++)
	   {
		   if(carr[i].getName().equals(name))
		   {
			   System.out.println("---------------------------");
			   System.out.println("이름      이메일      그룹");
			   System.out.println(carr[i].getName() + "   " + carr[i].getEmail() + "   " + carr[i].getGroup());
			   System.out.println("---------------------------");
			   System.out.println("");
		   }
	   }
   }

	
}
