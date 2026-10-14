package methods;

public class five {
	public static void main(String[] args) {
		
		School school=new School();
		school.name="KCT";
		school.pincode=1111;
		System.out.println(school.name);
		System.out.println(school.pincode);
		
		School school2=new School();
		school2.name="Podar";
		school2.pincode=9999;
		System.out.println(school2.name);
		System.out.println(school2.pincode);
		
		System.out.println(school.name); //school name changed to Podar!!!!
	}
}
class School{
	static String name; 
	int pincode;
}