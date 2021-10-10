package contact;

public class Contact {
	private String name;
	private String email;
	private String groupname; 
	private String present;
	private String city;
	
	public Contact(String name,String email,String groupname)
	{
	   this.name = name;
	   this.email = email;
	   this.groupname = groupname;
	}
    public Contact(String name,String email,String present, String city)
    {
       this.name = name;
  	   this.email = email;
  	   this.present = present;
  	   this.city = city;
    	
    }
	
	String getName() {return name;}
	String getEmail() {return email;}
	String getGroup() {return groupname;}
	String getPresent() {return present;}
	String getCity() {return city;}
	
	public String toString() {return (" " + name + email + groupname);}

}
