package collection.project1;

public class StoreofThing {
	
	String name;
	String color;
	String location;
	
	 public StoreofThing() {
		super();
	}

	StoreofThing(String name, String color,String location) {
		super();
		this.name = name;
		this.color = color;
		this.location=location;
	}

	@Override
	public String toString() {
		return "StoreofThing [name=" + name + ", color=" + color + ", location=" + location + "]";
	}
	
	

}
