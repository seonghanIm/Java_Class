package group;


public class Group {
	private static int id=0;
	private int index = 0;
	private String title;
	
	public Group(String title) {
		this.title = title;
		id +=1;
	    this.index = id;
	}
	public void setGroupName(String title) {this.title = title;}
	public String getGroupName() {return title;}
	int getId() {return index;}

}
