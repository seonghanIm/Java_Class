package contact;

import java.util.Scanner;

import group.*;
import main_control.CMS;



public class ContactManager extends CMS {
	private Contact[] carr;
	private Contact[] Ccarr;
	private int index = 0;
	Scanner sc;
	
	public ContactManager(int n) {
		carr = new Contact[n];
		Ccarr = new Contact[n];
		sc = new Scanner(System.in);
	
	}
	public void addContact() {
		System.out.println("<<연락처 정보입력>>");
		System.out.print(" - 이름 : ");
		String name = sc.nextLine();
		System.out.print(" - 이메일 : ");
	    String email = sc.nextLine();
	    
	    gm.showGroup();
	    System.out.print("그룹>");
	    int groupid = sc.nextInt();
	    System.out.println("");
	    String groupname = gm.returnTitle(groupid);
	    carr[index++] = new Contact(name,email,groupname);
	    System.out.println(groupname + " " + name + " 추가 성공..");
	   
	    
	   // System.out.print(" - 그룹 : ");
	   // String groupString = sc.nextLine();
       // gm.addGroup(groupString);
	   // carr[index++] = new Contact(name,email,groupString);
	    
	    //System.out.println(groupString +" "+ name + " 추가 성공..");
	    System.out.println("");
		
	}
	public void addCompanyContact() {
		System.out.println("<<연락처 정보입력>>");
		System.out.print(" - 이름 : ");
		String name = sc.nextLine();
		System.out.print(" - 이메일 : ");
	    String email = sc.nextLine();
	    System.out.print(" - 대표자 : ");
	    String groupString = sc.nextLine();
        GroupManager gm = new GroupManager(50);
        gm.addGroup(groupString);
        System.out.print(" - 도시 : ");
        String city = sc.nextLine();
        
	    Ccarr[index++] = new Contact(name,email,groupString,city);
	    
	    System.out.println(groupString +" "+ name + " 추가 성공..");
	    System.out.println("");
	}
	
   public void showAll() {
	   System.out.println("---------------------------");
	   System.out.println("이름     이메일     그룹   ");
	   System.out.println("---------------------------");
	   for(int i=0;i<index;i++) {
		   if(carr[i]!=null)
		   {
		   System.out.println(carr[i].getName() + "   " + carr[i].getEmail() + "   " + carr[i].getGroup());
		   System.out.println("---------------------------");
		   }
		   if(Ccarr[i]!=null)
		   {
		   System.out.println(Ccarr[i].getName() + "   " + Ccarr[i].getEmail() + "   " + Ccarr[i].getPresent() + "   " + Ccarr[i].getCity());
		   System.out.println("---------------------------");
		   }
	   }
		   
	   System.out.println("");
   }
   public void searchContact(){
	   System.out.print("검색이름 >>");
	   String name=sc.nextLine();

	   
	   for(int i=0;i<index;i++)
	   {

		
		   if(carr[i]!=null) {
		   if(carr[i].getName().equals(name))
		   {
			   System.out.println("---------------------------");
			   System.out.println("이름      이메일      그룹");
			   System.out.println("---------------------------");

			   System.out.println(carr[i].getName() + "   " + carr[i].getEmail() + "   " + carr[i].getGroup());
			   System.out.println("---------------------------");
			   
		   }
		   }
		   if(Ccarr[i]!=null) { 
		   if(Ccarr[i].getName().equals(name)&&Ccarr[i]!=null)
		   {
			   System.out.println("---------------------------");
			   System.out.println("이름      이메일      대표     도시");
			   System.out.println("---------------------------");
			   
			   System.out.println(Ccarr[i].getName() + "   " + Ccarr[i].getEmail() + "   " + Ccarr[i].getPresent() + "   " + Ccarr[i].getCity());
			   System.out.println("---------------------------");
			  
		   }
		   
		   System.out.println("");
		   }
	   }
   }

	
}
