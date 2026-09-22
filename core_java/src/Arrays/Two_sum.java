package Arrays;

public class Two_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={2,5,3,2,6};
        int target=8;

        for(int i=0;i<nums.length;i++){
        	for(int j=i+1;j<nums.length;j++) {
        		if(nums[i]+nums[j]==target){
                    System.out.print(i);
                    System.out.println(j);
                }

        	}
                    }
	}
}


		    

	


