package core_practice;

public class Prime {

	public static void main(String[] args) {
		   int number=1417;
	       
	       boolean flag =false;
	       
	       for(int i=2;i<=9;i++)
	       {
	           if(number % i ==0)
	           {
	               flag=true;
	           }
	           
	           
	       }
	       if(flag) {
	    	   System.out.println("composite");
	       }
	       else {
	    	   System.out.println("prime");
	       }
	       
	       
	       
	

	}

}
