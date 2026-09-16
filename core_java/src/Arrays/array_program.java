package Arrays;

public class array_program {

	public static void main(String[] args) {

			int arr[]= {10,89,56,78,45,26,23};
			
			int lowest=0;
			int secondh=0;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]>lowest)
				{
					secondh=lowest;
					lowest=arr[i];
				}
				if(arr[i]!=lowest&&arr[i]>secondh)
				{
					secondh=arr[i];
				}
			}

			System.out.println("heights of array:"+lowest);
			System.out.println("second heights of array:"+secondh);
		}

	}

	


