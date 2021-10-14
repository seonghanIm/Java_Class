package java_class;
public interface Comparable{
	int compareTo(Object other);
}


public class Box2 implements Comparable {
	private double volume = 0;
	public Box2(double v) {
		volume = v;
	}
	
	public int compareTo(Object otherObject) {
		Box2 other = (Box2) otherObject;
		if(this.volume < other.volume) return -1;
		else if(this.volume>other.volume) return 1;
		else return 0;
	}

	public static void main(String[] args) {
      Box2 b1 = new Box2(100);
      Box2 b2 = new Box2(85.0);
    if(b1.compareTo(b2)>0)
    {
    	  System.out.println("  b1>b2");
	}
	else
	{
		System.out.println("b2>b1");
	}
	}

}
