package cms.contact;

public class Contact {
	private String name;
	private String email;
	private Group group; 
	
	public Contact(String name,String email,Group group)
	{
	   this.name = name;
	   this.email = email;
	   this.group = group;
	}
	
	String getName() {return name;}
	String getEmail() {return email;}
	String getGroup() {return group.getGroupName(); }
	
	public String toString() {return (" " + name + email + group);}

}
