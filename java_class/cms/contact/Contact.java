package cms.contact;

public class Contact {
	private String name;
	private String email;
	private String groupname; 
	
	public Contact(String name,String email,String groupname)
	{
	   this.name = name;
	   this.email = email;
	   this.groupname = groupname;
	}
	
	String getName() {return name;}
	String getEmail() {return email;}
	String getGroup() {return groupname; }
	
	public String toString() {return (" " + name + email + groupname);}

}
