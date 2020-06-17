import java.util.Arrays;

public class cloneArray {
	
	public static void display(int[] arr) {
		
		int[] sArr = arr.clone();
		Arrays.sort(sArr);
		
		int left=0; int right = sArr.length;
		
		System.out.println(right);
		
//		for(int i=0; i<arr.length; i++) {
//		System.out.println(arr[i]);
//	}
	}
	public static void main(String[] args) {
		
		int[] arr = {2,6,3,7,1,8,90};
		display(arr);
		

	}

}
