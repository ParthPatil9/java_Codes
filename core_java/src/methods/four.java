package methods;

public class four {

	public static void main(String[] args) {
		
		Bank first = new Bank();
		first.name="SBI";
		first.amount=45643;
		
		Bank second = new Bank();
		second.name="AxisBank";
		second.amount=35436;
		
		System.out.println(first.name);
		System.out.println(second.name);
	}
}
class Bank{
	String name;
	int amount;
	
}
