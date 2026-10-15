package myPractice;
//prime number
public class prac4 {

	public static void main(String[] args) {
		int arr[]= {3,5,9,7,8};
		
		for(int i=0;i<arr.length;i++) {
			boolean prime=true;
			if(arr[i]<2) {
				prime=false;}
			
			for(int j=2;j<arr[i];j++) {
				if(arr[i]%j==0) {
					prime=false;
					break;
				}
			}
			if(prime) {
				System.out.println(arr[i]+" is prime");
			}
			else {
				System.out.println(arr[i]+" is composite");
			}
			
		}
		
		
	}
}
