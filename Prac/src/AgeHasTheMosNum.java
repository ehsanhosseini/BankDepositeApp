import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;


 public class AgeHasTheMosNum{
	public static void main(String[] args) {

		ArrayList<Member> list = new ArrayList<Member>();
		
		list.add(new Member("shs@gmail.com", 20, "Male"));
		list.add(new Member("gdg@gmail.com", 40, "Female"));
		list.add(new Member("nd@gmail.com", 15, "Male"));
		list.add(new Member("gfsk@gmail.com", 20, "Female"));
		list.add(new Member("nhsdfah@gmail.com", 20, "Male"));
	
		int max = 0;
		int curr = 0;
		Member currKey = null;
		Set<Member> unique = new HashSet<Member>(list);
		
		for(Member key : unique) {
			curr = Collections.frequency(list, key);
			if(max<curr) {
				max = curr;
				currKey = key;
				
			}
		}
			
			System.out.println(currKey + " happens "+ max+ " times");	
		
	}

}

 
 
 
 
 
 
	

 
 
 
 
 
// HashMap<Member, Integer> frecuencyMap = new HashMap<Member, Integer>();
//	for(Member i:list) {
//		if(frecuencyMap.containsKey(i)) {
//			
//			frecuencyMap.put(i,  frecuencyMap.get(i)+1);
//		}
//		else
//		{
//			frecuencyMap.put(i, 1);
//		}
//	}
//		Member element = null;
//		int frecuency = 1;
//		
//		Set<Entry<Member, Integer>> entrySet = frecuencyMap.entrySet();
//		for(Entry<Member, Integer> entry : entrySet) {
//			
//			if(entry.getValue()> frecuency) {
//				
//				element = entry.getKey();
//				frecuency = entry.getValue(); 
//				
//			}
//		}
//		if(frecuency>1) {
//			
//			System.out.println("The most frequent age is "+element);
//			System.out.println("Its Frequency :" +frecuency);
//		}