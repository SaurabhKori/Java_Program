package multilevelInheritance;

public class D extends C{
	int x=120;
	int s=30;
	public void ddetails() {
		System.out.println(this.x);
		System.out.println(this.s);
		System.out.println(super.x);
		System.out.println(super.r);
		System.out.println(q);
		System.out.println(p);
		System.out.println(ax());
		System.out.println(bx());
	}

}
