package member;
import team.*;
public class Member extends TeamList {
	int id = 0;
	String name;
    public Team tm;
	public Member(int id,String name,String team)
	{
		tm = new Team(team,id);
		this.id = id;
		id++;
		this.name = name;
	}
}
	
	


