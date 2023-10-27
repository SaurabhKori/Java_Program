package has_a_Relationship_Composition;

public class Driver {
	public static void main(String[] args) {
		Engine e=new Engine(12,12,"ss");
		Car c=new Car("MAruti",122223,e);
		c.displayC();
		c.e.start();
//		System.out.println(c.e.np);
		
			
	}

}
