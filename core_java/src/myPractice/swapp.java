package myPractice;
import java.util.*;

public class swapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		int temp=arr[0];
		
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=temp;
		System.out.println(Arrays.toString(arr));
		
		}}


