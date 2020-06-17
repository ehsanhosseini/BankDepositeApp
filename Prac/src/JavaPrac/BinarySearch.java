package JavaPrac;

public class BinarySearch {
	
	
	public static int binaryS(int[] arr, int target, int start, int end) {
		
		if(start<=end) {
			
			int mid = (start+end)/2;
			if(target == arr[mid]) {
				return mid;
			}
			
			if(target<arr[mid]) {
				
				return	binaryS(arr, target, start, mid-1);
			}
			else {
				
				return binaryS(arr, target, mid+1, end);
			}
		}
		
		return -1;
		
	}
	
	public static void main(String[] args) {
		
			int[] arr = {2,3,4,5,6,789,90};
			int target = 6;
			System.out.println(binaryS(arr, target, 0, arr.length-1));
	}

}
