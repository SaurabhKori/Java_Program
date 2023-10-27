package facebook_project_Encapsulation;

public class Facebook_Driver {
	public static void main(String[] args) {
		Facebook f=new Facebook(new User("Mahesh",21,"mahesh12",1234,"male"));
		f.accessDetails();
	}

}
