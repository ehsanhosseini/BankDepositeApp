package JavaPrac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {
	
	 public static  List<List<Integer>> threeSum(int[] nums) {
	        
         Arrays.sort(nums);
   
       HashSet<List<Integer>> result = new HashSet<List<Integer>>();
       
       for(int i=0; i<nums.length; i++){
          
           int j = i + 1;
           int k = nums.length-1;
           
           while(j<k){
           int sum = nums[i] + nums[j] + nums[k];
           if(sum<0){
               j++;
               }
           else if(sum>0){
               k--;
               }
           
           else{
                ArrayList<Integer> list = new ArrayList<Integer>();
               list.add(nums[i]);
               list.add(nums[j]);
               list.add(nums[k]);
               //if(!result.contains(list)){
               result.add(list);
              // }
               j++;
               k--;
               } 
           
           }         
       }
      
      // return result;
       return new ArrayList(result);     
	 }

	public static void main(String[] args) {
		
		int[] arr = {-1, 0, 1, 2, -1, -4}; 
		System.out.println(threeSum(arr));
	}

}
