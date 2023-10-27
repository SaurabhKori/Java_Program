package has_a_relationship_Aggrigiation;

public class Address {
	String city;
	String state;
	int pin;
	Address(){

}
	Address(String city,String state,int pin){
		this.city=city;
		this.state=state;
		this.pin=pin;
	}
	public void displayA() {
		System.out.println("Student City name=====>"+city);
		System.out.println("Student state name====>"+state);
		System.out.println("Student pin ==========>"+pin);
		
	}
		
}