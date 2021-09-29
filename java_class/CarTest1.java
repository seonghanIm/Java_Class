package java_class;



class Car1 {
	private String color;
	private int speed;
	private int gear;
    
	public String getColor() { return color;}
	public void setColor(String C) {color = C;}
	public int getSpeed() {return speed;}
	public void setSpeed(int s) { speed = s;}
	public int getGear() { return gear; }
	public void setGear(int g) {gear = g;}
	
}



public class CarTest1 {

	public static void main(String[] args) {
	
		Car1 car = new Car1();
		
		car.setColor("Red");
		System.out.println(car.getColor());
		car.setSpeed(100);
		System.out.println(car.getSpeed());
		car.setGear(3);
		System.out.println(car.getGear());

	}

}
