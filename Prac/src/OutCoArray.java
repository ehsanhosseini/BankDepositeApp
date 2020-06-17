import java.util.ArrayList;
import java.util.HashMap;

public class OutCoArray {
	
	
	public static ArrayList<Integer> pair(int[] arr) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
 		for(int i=0; i<arr.length; i++) {
			
		if(map.containsKey((arr[i])*-1)) {
			if(!list.contains(Math.abs(arr[i]))) {
			list.add(Math.abs(arr[i]));
			}
		}
		else {
			map.put(arr[i], i);
		}
			
		}
		return list;
	}

	public static void main(String[] args) {
		
		int arr[] = new int[]{6,1,2,3,-6, -2, -6, -6};
		System.out.println(pair(arr));

	}

}
