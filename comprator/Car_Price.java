package comprator;

import java.util.Comparator;

public class Car_Price implements Comparator<Car> {
	public int compare(Car c1,Car c2) {
		return (int)(c1.car_price-c2.car_price);
	}

}
