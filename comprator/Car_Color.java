package comprator;

import java.util.Comparator;

public class Car_Color implements Comparator<Car>{
	public int compare(Car c1,Car c2) {
		return c1.car_color.compareTo(c2.car_color);
//		if(c1.car_color.equals("black"))
	}

}
