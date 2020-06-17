package JavaPrac;

import java.util.HashMap;
import java.util.Map;

public class HashcodeEqualMap {
	
	int id;
	String name;
	
	HashcodeEqualMap(String name, int id){
		this.id=id;
		this.name=name;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashcodeEqualMap other = (HashcodeEqualMap) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}



	public static void main(String[] args) {


		
		HashcodeEqualMap obj1 = new HashcodeEqualMap("Ehsan", 100);
		HashcodeEqualMap obj2 = new HashcodeEqualMap("Ehsan", 100);
				
		HashMap<HashcodeEqualMap, Integer> map = new HashMap<HashcodeEqualMap, Integer>();
		map.put(obj1, 1);
		map.put(obj2, 2);
		
		for(HashcodeEqualMap n: map.keySet()) {
		System.out.println(map.get(n));
		System.out.println(n.hashCode());
		}

	}

}
