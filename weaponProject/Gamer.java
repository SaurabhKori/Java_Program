package weaponProject;
import java.util.Scanner;
public class Gamer {
	public Weapon pressbutton() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Score");
		int score=sc.nextInt();
		if(score<=400) {
			System.out.println("You get Knife");
			Knife k=new Knife();
			return k;
		}
		else if (score>400 && score<=800) {
			System.out.println("you get Gun");
			Gun g=new Gun();
			return g;
		}
		else {
			System.out.println("You get bomb");
			Bomb b=new Bomb();
			return b;
		}
		
	}

}
