package cms.group;


public class GroupManager {
	private Group[] garr;
	private int index;
	
	public GroupManager(int n) {
		garr = new Group[n];
	
	}
	
	 public void addGroup(String title) {
		 garr[index++] = new Group(title);
	 }

}
