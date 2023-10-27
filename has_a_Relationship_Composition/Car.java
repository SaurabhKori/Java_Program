package has_a_Relationship_Composition;

public class Car {
	String name;
	double price;
	Engine e=new Engine();
	Car(String name,double price,Engine e){
		this.name=name;
		this.price=price;
		this.e=e;
		
	}
	public void displayC() {
		System.out.println("Car name======>"+name);
		System.out.println("Car price======>"+price);
		e.displayE();
	}
	

}
