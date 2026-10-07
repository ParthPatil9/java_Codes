package methods;
//CONSTRUCTOR INJECTION:minimun values to create successful obj.
public class flipkart {

	public static void main(String[] args) {
		order or = new order("PP","999999999","411021");
		System.out.println(or.name);
		System.out.println(or.contact);
		System.out.println(or.pincode);
		System.out.println(or.landmark);
		System.out.println(or.price);
	}
}
class order{
	double price;
	String name;
	String contact;
	String  pincode;
	String landmark;
	
	public order(String na,String cont) {
		System.out.println("const 1:");
		this.name=na;
		this.contact=cont;//NOTE: assigning values to variables is necessary ,if u directly print from the parameters of constructors the variables hv no value.
		
	}
	public order(String na,String cont,String pin) {
		System.out.println("const 2:");

		this.name=na;
		this.contact=cont;
		this.pincode=pin;
		
	}
	public order(String na,String cont,String pin,String land) {
		System.out.println("const 3:");

		this.name=na;
		this.contact=cont;
		this.pincode=pin;
		this.landmark=land;
	}
	public order(String na,String cont,String pin,String land,double pri) {
		System.out.println("c onst 4:");

		this.name=na;
		this.contact=cont;
		this.pincode=pin;
		this.landmark=land;
		this.price=pri;
	}
}
