package multilevelInheritance;

public class Son extends Father{
	String sname="Rohan";
	int age=21;
	public void sdetails() {
		int age=21;
		System.out.println("Son details===>"+sname);
		System.out.println("Son age=======>"+age);
		System.out.println(super.fname);
		System.out.println(this.age);
		System.out.println(super.age);
		fdetails();
	}

}
