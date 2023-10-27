package abstraction;

public class Driver {
	public static void main(String[] args) {
		Vehicle v=new BodyofCar();
		v.start();
		v.stop();
		Car c= new BodyofCar();
		c.openGate();
		c.openMirror();
		c.start();
		c.stop();
	}

}
