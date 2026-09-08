package Arrays;

public class SearchElement {

	public static void main(String[] args) {
		int[] arr = {2,6,3,8,59,23,84,5,99,44,25};
		int search = 5;
		boolean found = false;
		
		for(int i = 0; i<arr.length;i++) {
			if (arr[i]==search) {
				found = true;
				break;
			}
			
		}
		if(found=true) {
			System.out.println("FOUND");
		}
		else {
			System.out.println("NOT FOUND");
		}

	}

}
