package multilevelInheritance;

public class Father extends grandfathder{
	String fname="Sohan";
	int age=45;
	public void fdetails() {
		int age=45;
		System.out.println("Father name=====>"+fname);
		System.out.println("Father age=====>"+age);
		System.out.println(super.gname);
		System.out.println(this.age);
		System.out.println(super.age);
		gdetails();
	}

}
