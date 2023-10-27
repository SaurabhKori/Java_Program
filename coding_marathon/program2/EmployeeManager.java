package coding_marathon.program2;

public class EmployeeManager {
	 private String name;
	  private String designation;
	  private double salary;
	  private double baseSalary;

	  
	  public EmployeeManager(String name, String designation, double salary, double baseSalary) {
	    this.name = name;
	    this.designation = designation;
	    this.salary = salary;
	    this.baseSalary = baseSalary;
	  }

	  
	  public String getName() {
	    return name;
	  }

	  public void setName(String name) {
	    this.name = name;
	  }

	  public String getDesignation() {
	    return designation;
	  }

	  public void setDesignation(String designation) {
	    this.designation = designation;
	  }

	  public double getSalary() {
	    return salary;
	  }

	  public void setSalary(double salary) {
	    this.salary = salary;
	  }

	  public double getBaseSalary() {
	    return baseSalary;
	  }

	  public void setBaseSalary(double baseSalary) {
	    this.baseSalary = baseSalary;
	  }

	 
	  public double calculatePercentage(double percentage) {
	    return salary * percentage / 100.0;
	  }

	 
	  public void displayDetails() {
	    System.out.println("Name: " + name);
	    System.out.println("Designation: " + designation);
	    System.out.println("Salary: " + salary);
	    System.out.println("Base Salary: " + baseSalary);
	    System.out.println();
	  }

}
