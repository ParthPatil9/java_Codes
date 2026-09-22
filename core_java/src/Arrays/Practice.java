package Arrays;

public class Practice {

	public static void main(String[] args) {
		int arr[]= {2,7,45,17,58,13};
		
		for(int i=0;i<arr.length;i++) {
	           
	           if(i%2==0)
	           {
	           //    System.out.println(i);
	               boolean flag=false;
	               for(int j=2;j<arr[i];j++)
	               {
	                   if(arr[i]%j==0)
	                   {
	                       flag=true;
	                   }
	               }
	               if(!flag)
	               {
	                   System.out.println("PRIME AT:"+i+"::" +arr[i]);
	               }
	               else
	               {
	                   System.out.println("Composite AT:"+i+"::"+arr[i]);
	               }
	           }
	       }
	   }
	}
