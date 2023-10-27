package comprator;

public class Car{
	String car_name;
	String car_color;
	double car_price;
	Car(){
		
	}
	public Car(String car_name, String car_color, double car_price) {
		super();
		this.car_name = car_name;
		this.car_color = car_color;
		this.car_price = car_price;
	}
	@Override
	public String toString() {
		return "Car [car_name=" + car_name + ", car_color=" + car_color + ", car_price=" + car_price + "]";
	}
	
	

}
