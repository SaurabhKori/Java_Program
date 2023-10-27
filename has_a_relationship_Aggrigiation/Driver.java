package has_a_relationship_Aggrigiation;

public class Driver {
	public static void main(String[] args) {
		Address a=new Address("pratapgarh","UP",230144);
		Student s=new Student("sfdsf","dsaffds",a);
		s.displayS();
		s=null;
		a.displayA();
		s.displayS();
	}

}
