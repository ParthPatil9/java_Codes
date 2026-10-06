package myPractice;
//REMOVE Particular element

public class two {

	public static void main(String[] args) {
		int nums[]= {2,4,2,47,2};
		int target=2;
		
		for(int i=0;i<nums.length;i++) {
			boolean flag=false;
			
			if(nums[i]==target) {
				flag=true;
			}
			else {
				System.out.print(nums[i]+ " ");
			}
			
			
		}
		

}
}
