package member;

public class Mentor extends Member {
	String org;
	public Mentor(int id,String name,String team,String org){
		super(id,name,team);
		this.org = org;
	}
	public String toString()
	{
		return super.id+1 + "       " + super.name + "        " + super.tm.getTeam() + "        " + this.org;
	}

}
