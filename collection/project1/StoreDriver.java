package collection.project1;

import java.util.ArrayList;
import java.util.List;

public class StoreDriver {
	public static void main(String[] args) {
		List<StoreofThing> l1=new ArrayList<StoreofThing>();
		l1.add(new StoreofThing("bag","red","bed"));
		l1.add(new StoreofThing("Key","black","bed"));
		l1.add(new StoreofThing("Shirt","White","Almira"));
		l1.add(new StoreofThing("Remote","black","near by tv"));
		
//		System.out.println(l1);
		System.out.println(l1.get(2));
		
	}

}
