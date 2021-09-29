package java_class;


class Car{
	String color;
	int speed;
	int gear;
	
	void print() {
		System.out.println("( "+color+","+speed+","+"gear"+" )");
	}
	
}

public class CarTest {

	public static void main(String[] args) {
		
		Car mycar=new Car();
		mycar.color = "red";
		mycar.speed = 0;
		mycar.gear = 1;
		mycar.print();


	}

}
