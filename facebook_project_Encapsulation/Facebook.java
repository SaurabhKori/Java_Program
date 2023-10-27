package facebook_project_Encapsulation;
import java.util.*;

public class Facebook {
	private User u=new User();
	Facebook(){
		
	}
	Facebook(User u){
		this.u=u;
	}
	public void accessDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your user Id");
		String us=sc.nextLine();
		System.out.println("Enter Your password");
		int pass=sc.nextInt();
		if(u.getUid().equals(us) && u.getPwd()==pass) {
		
		showDetail();
		System.out.println("If you want to change name,age,gender,password.then write Setting");
		sc.nextLine();
		String s=sc.nextLine();
		if(s.equals("Setting")||s.equals("setting")) {
			setting();
		}
		else {
			System.out.println("Please! write the right command");
		}
		
		}
		else {
			System.out.println("You are invalid person");
		}
		
	}
	private void showDetail() {
		
		System.out.println(" Name=====>"+u.getName());
		System.out.println("Gender====>"+u.getGender());
		System.out.println("Age=======>"+u.getAge());
	
	}
	private void setting() {
		Scanner sc=new Scanner(System.in);
		System.out.println("change name press * 1* and change age press * 2 * and change gender press *3* and change password press:4");
		switch(sc.nextInt()){
		case 1:
			System.out.println("Enter your name");
			sc.nextLine();
		    u.setName(sc.nextLine());
		    System.out.println("Your updated detail");
		    showDetail();
		    break;
		case 2:
			System.out.println("Enter Your new age");
			u.setAge(sc.nextInt());
			System.out.println("Your updated detail");
		    showDetail();
			break;
		case 3:
			System.out.println("Enter your gender");
			sc.nextInt();
			u.setGender(sc.nextLine());
			System.out.println("Your updated detail");
		    showDetail();
			break;
		case 4:
			System.out.println("Enter your Old Passward");
			int p=sc.nextInt();
			if(u.getPwd()==p) {
				
				 u.setPwd(sc.nextInt());
				 System.out.println("please login your page");
				 accessDetails();
			}
		
		
		}
	}
	

}
