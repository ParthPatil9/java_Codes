package methods;

public class two {

	public static void main(String[] args) {
		Laptop lappy=new Laptop();
		lappy.start();
		lappy.shutdown();
		
		int series= lappy.series();
		System.out.println(series);
		
	}

}
class Laptop{
	public void start(){
		System.out.println("starting");
	}
	public void shutdown() {
		System.out.println("shuting down");
	}
	public int series() {
		return 9999;
	}
}
