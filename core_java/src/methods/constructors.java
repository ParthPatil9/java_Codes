package methods;

public class constructors {

	public static void main(String[] args) {
		Bike shine=new Bike(9,"Nitesh");//Bike() is the constructor
		System.out.println(shine.mileage);
		System.out.println(shine.Driver);
	} 
}
class Bike{
	int mileage;
	String Driver;
	public Bike() //accessed only when parameters are not given 
	{
		System.out.println("NON-PARAMETERIZED CONSTRUCTOR");
	}
	public Bike(int mil,String dri) //parameterised constructor
	{
		this.mileage=mil;
		this.Driver=dri;
	}
}
