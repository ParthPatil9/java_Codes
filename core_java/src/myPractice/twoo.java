package myPractice;
import java.util.*;

public class twoo {

	public static void main(String[] args) {
		ArrayList<Integer>set= new ArrayList<Integer>();
		
		int arr[]= {3,6,3,89,9};
		int arr2[]= {5,8,9,4,35};

		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		for(int j=0;j<arr2.length;j++) {
			set.add(arr2[j]);
		} 
		System.out.print(set+" ");
	}}
