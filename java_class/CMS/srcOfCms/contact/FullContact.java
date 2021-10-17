package contact;

public class FullContact extends Contact {
	String address;
   
	
	 public FullContact(String name,String email,String groupname,String address){
	     super(name,email,groupname);
		 this.address = address;
	 }
	 public String toString()
	 {
		 return " " + address;
	 }

		
	

}
