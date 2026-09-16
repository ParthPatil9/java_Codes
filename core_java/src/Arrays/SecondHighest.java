

public class SecondHighest {

	public static void main(String[] args) {
		int arr[]= {10,89,56,78,45,26,23};
		
		int lowest=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>lowest)
			{
				lowest=arr[i];
			}
		}

		System.out.println(lowest);
	}

}
