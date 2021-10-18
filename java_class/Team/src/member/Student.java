package member;

public class Student extends Member {
	String major;
	public Student(int id,String name,String team,String major){
		super(id,name,team);
		this.major = major;
	}
	
	public String toString()
	{
		return super.id+1 + "       " + super.name + "        " + super.tm.getTeam() + "        " + this.major;
	}

}