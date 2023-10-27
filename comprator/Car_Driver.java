package comprator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Car_Driver {
	public static void main(String[] args) {
		List<Car> l1=new ArrayList<Car>();
		l1.add(new Car("Audi","red",374732.37));
		l1.add(new Car("Audi","black",774732.37));
		;
		l1.add(new Car("Thar","red",974732.37));
		l1.add(new Car("Thar","white",374732.37));
		l1.add(new Car("Thar","yellow",374732.37));
		l1.add(new Car("Thar","black",974732.37));
		l1.add(new Car("Audi","white",374732.37));
		l1.add(new Car("Audi","yellow",974732.37));
		l1.add(new Car("Bmw","red",874732.37));
		l1.add(new Car("Bmw","white",3174732.37));
		l1.add(new Car("Bmw","yellow",374732.37));
//		for(Car c1:l1) {
//			System.out.println(c1);
//		}
		Collections.sort(l1, new CarName());
		for(Car c1:l1) {
			System.out.println(c1);
		}
		System.out.println("======================================================================================");
		System.out.println();
		Collections.sort(l1,new Car_Color());
		for(Car c1:l1) {
			System.out.println(c1);
		}
		System.out.println("-------------------------------------------------------------------------");
		System.out.println();
		System.out.println();
		Collections.sort(l1,new Car_Price());
		for(Car c1:l1) {
//			if(c1.car_color=="black") {
			System.out.println(c1);
//			}
		}
//		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
	}

}
