package Arrays;

public class count_prime_num {

	public static void main(String[] args) {
		int arr[] = {13,11,17,19,21,23,27,91};
		int counter = 0;
		
		
		for(int i=0;i<arr.length;i++) {
			boolean flag=false;
			for(int j=2;j<arr[i];j++) {
				if(arr[i]%j==0) {
					flag=true;
					counter++;
					
				}
				else {
					
				}
				
				
			}
			if(flag==true) {
				System.out.println("composite "+ arr[i]);
				
				
			}
			else {
				System.out.println("prime "+arr[i]);
				
			}
			
			
		}
		System.out.println("counter : "+counter);

		
		

	}

}
