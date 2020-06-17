import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class MemberProfil {

	public static int binaryS(int[] arr, int num ) {
		
		int start = 0; 
		int end = arr.length-1;
		
		
		
			 while(start<=end) {
		int mid = start+(end-start)/2;
		if(arr[mid]==num) 
			return mid;
			
		if(arr[mid]<num) 
			 start = mid+1;
		else
			end = mid-1;
		}
		
		return -1;
	}
	public static void main(String[] args) {
		int[] arr = {2,3,5,7,9,10,12,50,60};
		int num = 3;
		System.out.println(binaryS(arr,num));
}
}
