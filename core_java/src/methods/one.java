package methods;

public class one {
	public static void main(String args[]) {
		Aeroplane aero=new Aeroplane();
		
		aero.takeoff();
		aero.landing();
		
		int fuel =aero.fuel();
		System.out.println(fuel);
		
	}
	}

class Aeroplane{
	public void takeoff() {
		System.out.println("taking offff");
	}
	public void landing() {
		System.out.println("landing onnnn");
	}
	public int fuel() {
		return 1234;
	}

}
