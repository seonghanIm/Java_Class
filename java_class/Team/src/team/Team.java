package team;

public class Team {
	String team;
	int id;
	
	public Team(String team,int id)
	{
		this.team = team;
		this.id = id;
		id++;
		
	}
	public String getTeam()
	{
		return team;
	}
	
	public String toString() {
		int nid = id+1;
		return " "+ nid + "       " + team;
	}
	


}
