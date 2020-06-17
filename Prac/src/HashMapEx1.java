public class HashMapEx1 {
	
	
	

	public int insetAndPrint(int arr[]) {
		
		int max = arr[0];
		for(int i=0; i<arr.length; i++) 
		if(arr[i]>max)
			max = arr[i];
		
			return max;
		
	}
	
	public static void main(String[] args) {
		int arr[]= {1,4,6,8,3,70};
		HashMapEx1 obj = new HashMapEx1();
		System.out.println(obj.insetAndPrint(arr));
		

	}

}
