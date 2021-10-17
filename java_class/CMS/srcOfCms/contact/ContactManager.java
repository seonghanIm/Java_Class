package contact;

import java.util.Scanner;

import group.*;
import show.*;
import main_control.CMS;



public class ContactManager extends CMS implements Showable{
	private Contact[] carr;
	private int index = 0;
	Scanner sc;
	
	public ContactManager(int n) {
		carr = new Contact[n];
		
		sc = new Scanner(System.in);
	
	}
	public void AddBasicContact() {
		sc = new Scanner(System.in);
		System.out.println("<<연락처 정보입력>>");
		System.out.print(" - 이름 : ");
		String name = sc.nextLine();
		System.out.print(" - 이메일 : ");
	    String email = sc.nextLine();
	    
	    gm.showAll();
	    System.out.print("그룹>");
	    int groupid = sc.nextInt();
	    System.out.println("");
	    String groupname = gm.returnTitle(groupid);
	    carr[index++] = new Contact(name,email,groupname);
	    System.out.println(groupname + " " + name + " 추가 성공..");
	    System.out.println("");
		
	}
	public void AddFullContact() {
		sc = new Scanner(System.in);
		System.out.println("<<연락처 정보입력>>");
		System.out.print(" - 이름 : ");
		String name = sc.nextLine();
		System.out.print(" - 이메일 : ");
	    String email = sc.nextLine();
	    System.out.print(" - 주소 : ");
	    String address = sc.nextLine();
	    
	    gm.showAll();
	    System.out.print("그룹>");
	    int groupid = sc.nextInt();
	    System.out.println("");
	    String groupname = gm.returnTitle(groupid);
	    carr[index++] = new FullContact(name,email,groupname,address);
	    System.out.println(groupname + " " + name + " 추가 성공..");
		
	}

	
   public void showAll() {
	   System.out.println("---------------------------");
	   System.out.println("이름     이메일     그룹    주소");
	   System.out.println("---------------------------");
	   for(int i=0;i<index;i++) {
		   if(carr[i] instanceof FullContact)
		   {
			   if(carr[i]!=null)
			   {
			   System.out.println(carr[i].getName() + "   " + carr[i].getEmail() + "   " + carr[i].getGroup() + "   " + carr[i].toString());
			   System.out.println("---------------------------");
			   }
			   
			   
		   }
		   else {
		   if(carr[i]!=null)
		   {
		   System.out.println(carr[i].getName() + "   " + carr[i].getEmail() + "   " + carr[i].getGroup());
		   System.out.println("---------------------------");
		   }
		   }
		   
	   }
		   
	   System.out.println("");
   }
   public void searchContact(){
	   System.out.print("검색이름 >>");
	   String name;
	   sc=new Scanner(System.in);
	   
	   name = sc.nextLine();

	   
	   for(int i=0;i<index;i++)
	   {
		   if(carr[i] instanceof FullContact)
		   {
			   if(carr[i].getName().equals(name))
			   {
				   System.out.println("--------------------------------");
				   System.out.println("이름      이메일      그룹    주소");
				   System.out.println("--------------------------------");

				   System.out.println(carr[i].getName() + "     " + carr[i].getEmail() + "     " + carr[i].getGroup() +"    "+ carr[i].toString());
				   System.out.println("--------------------------------");
				   
			   }
			   
		   }
		   else {
		   
		   if(carr[i].getName().equals(name))
		   {
			   System.out.println("---------------------------");
			   System.out.println("이름      이메일      그룹    ");
			   System.out.println("---------------------------");

			   System.out.println(carr[i].getName() + "     " + carr[i].getEmail() + "     " + carr[i].getGroup());
			   System.out.println("---------------------------");
			   
		   }
		   }
		   
		   
		   System.out.println("");
		   
	   }
   }

	
}
