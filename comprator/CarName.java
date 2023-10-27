package comprator;

import java.util.Comparator;

public class CarName implements Comparator<Car>{
	public int compare(Car c1,Car c2) {
		return c1.car_name.compareTo(c2.car_name);
		
	}

}
