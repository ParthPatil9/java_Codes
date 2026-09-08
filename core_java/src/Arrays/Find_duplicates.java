package Arrays;

public class Find_duplicates {

	public static void main(String[] args) {
		int[] arr = {2,6,4,7,4,2,5,4,2};
		
		for(int i = 0;i<arr.length;i++) {
			
			for(int j = i+1;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					System.out.println("duplicates "+ arr[i]);
					
				}
			}
		}
	}
}
