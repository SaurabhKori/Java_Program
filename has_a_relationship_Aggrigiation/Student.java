package has_a_relationship_Aggrigiation;

public class Student {
	String name;
	String fname;
	Address d=new Address();
	Student(){
		}
	
	Student(String name,String fname,Address d){
		this.name=name;
		this.fname=fname;
		this.d=d;
		
	}
	public void displayS() {
		System.out.println("Student name====>"+name);
		System.out.println("Student fname====>"+fname);
		d.displayA();
		
	}
}
