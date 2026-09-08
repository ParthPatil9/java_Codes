package Arrays;

public class SecondLargest { //FIND SECOND LARGEST NUM IN ARRAY

	public static void main(String[] args) {
		int[] num = {2,8,7,3,5,0,6,8};
		int largest = num[0];
		int second = num[0];
		
		for(int i=0;i<num.length;i++) {
			if(largest<num[i]) {
				second = largest;
				largest=num[i];
				
			}
			else if(num[i]>second && num[i]!=largest) {
				num[i]=second;
				
				
			}
		}
		System.out.println("Largest number is :"+ largest);
		System.out.println("Second Largest number is :"+ second);

		

	}

}
