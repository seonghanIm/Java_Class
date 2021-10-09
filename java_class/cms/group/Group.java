package cms.group;


public class Group {
	private int id=0;
	private String title;
	
	public Group(String title) {
		this.title = title;
		id++;
	}
	public String getGroupName() {return title;}
	int getId() {return id;}

}
