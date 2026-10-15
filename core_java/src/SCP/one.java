package SCP;

public class one {

	public static void main(String[] args) {
		String s = "mumbai";
		String s2="latur";
		s2="mumbai";//s2 value is reassigned to mumbai
		//System.out.println(s2);
		//System.out.println(10==10);// '==' CHECKS MEMORY ADDRESS OF OBJECTS.
		System.out.println(s==s2);
		
		String s3 = new String("pune");//with new keyword you are explicitly creating new object,SCP is not going to work.
		String s4 = new String("pune");
		System.out.println(s2==s3);//gives false as new keyword is use.
		System.out.println(s3==s4);
		
		//s4="mumbai";//reassigned value so s==s4 is true
		//System.out.println(s4);
		System.out.println(s==s4);
		System.out.println(s3.equals(s4));//gives true as memory address does not matter to equals() operation.
		
//		equals compares only the content !!!
//		== compares memory location 

	}

}
