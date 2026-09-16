package Arrays;
//find prime number from an array.

public class Practicee {

	public static void main(String[] args) {
		int[] arr = {3,7,23,57,97,55,22};
		
		for(int i = 0;i<arr.length;i++) {
			boolean flag = false;
			
			for(int j=2;j<arr[i];j++) {
				
				if(arr[i]%j==0) {
					flag=true;
					break;
				}
			}
						
		if(flag==false) {
			System.out.println(arr[i]+" prime");
			
		}
		else {
			System.out.println(arr[i]+" not prime");
		}
		}
	}

}
