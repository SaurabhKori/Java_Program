package coding_marathon.program2;

import java.util.Scanner;

import coding_marathon.program2.EmployeeManager;


public class EmployeeDriver {
	 public static void main(String[] args) {
		    
		    Scanner sc = new Scanner(System.in);

		   
		    String name, designation;
		    double salary, baseSalary;

		    
		    EmployeeManager person = null;
		    EmployeeManager manager = null;

		   
		    int choice;

		    
		    do {
		     
		      System.out.println("1. Add manager");
		      System.out.println("2. Add person");
		      System.out.println("3. Display updated salary of person and display all details");
		      System.out.println("4. Display updated salary of manager and display all details");
		      System.out.println("5. Exit");

		      
		      System.out.print("Enter your choice: ");
		      choice = sc.nextInt();

		      
		      switch (choice) {
		        case 1:
		          
		          System.out.print("Enter the name of the manager: ");
		          sc.nextLine(); 
		          name = sc.nextLine();
		          System.out.print("Enter the designation of the manager: ");
		          designation = sc.nextLine();
		          System.out.print("Enter the salary of the manager: ");
		          salary = sc.nextDouble();
		          System.out.print("Enter the base salary of the manager: ");
		          baseSalary = sc.nextDouble();

		          
		          manager = new EmployeeManager(name, designation, salary, baseSalary);

		          
		          System.out.println("Manager added successfully.");
		          break;

		        case 2:
		         
		          System.out.print("Enter the name of the person: ");
		          sc.nextLine(); 
		          name = sc.nextLine();
		          System.out.print("Enter the designation of the person: ");
		          designation = sc.nextLine();
		          System.out.print("Enter the salary of the person: ");
		          salary = sc.nextDouble();
		          System.out.print("Enter the base salary of the person: ");
		          baseSalary = sc.nextDouble();

		          
		          person = new EmployeeManager(name, designation, salary, baseSalary);

		          
		          System.out.println("Person added successfully.");
		          break;

		        case 3:
		         
		          if (person != null && manager != null) {
		            
		            double managerPercentage = manager.calculatePercentage(8.0);
		            double personPercentage = person.calculatePercentage(3.0);

		            
		            if (manager.getSalary() > person.getSalary()) {
		             
		              person.setSalary(person.getSalary() + manager.getSalary());

		             
		              personPercentage = person.calculatePercentage(19.0);
		            }

		           
		            person.setSalary(person.getSalary() + personPercentage);
		            manager.setSalary(manager.getSalary() + managerPercentage);

		           
		            System.out.println("Updated salary and details of the person:");
		            person.displayDetails();
		          } else {
		            
		            System.out.println("Please add both manager and person first.");
		          }
		          break;

		        case 4:
		         
		          if (person != null && manager != null) {
		           
		            System.out.println("Updated salary and details of the manager:");
		            manager.displayDetails();
		          } else {
		            
		            System.out.println("Please add both manager and person first.");
		          }
		          break;

		        case 5:
		          
		          System.out.println("Thank you for using the program. Goodbye!");
		          break;

		        default:
		         
		          System.out.println("Invalid choice. Please try again.");
		      }
		    } while (choice != 5); 
		   
		    sc.close();
		  }
		}



