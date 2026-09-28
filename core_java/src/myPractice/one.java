package myPractice;
//REMOVE DUPLICATES

public class one {

	public static void main(String[] args) {
		int nums[]= {2,4,2,47,2};
		int nums2[]= {4,3,2,47,2};
		for(int i=0;i<nums.length;i++) {
			//boolean dup =false;
			int count=0;
			
			for(int j=1;j<nums.length;j++) {
				
				if(nums[i]==nums[j]) {
					count++;
				}
			}
			/*if(count==1) {
				System.out.println(nums[i]+ " ");
			}*/
				if(count==1) {
					System.out.print(nums[i]+ " ");
				}
		}
		

}
	}

