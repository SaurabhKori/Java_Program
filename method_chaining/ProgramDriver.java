package method_chaining;

public class ProgramDriver {
  public static void main(String[] args) {
	  Program1 pr1=new Program1();
	pr1.hi();
	Program2 pr=new Program2();
	pr.program2().hello();

	
}
}
