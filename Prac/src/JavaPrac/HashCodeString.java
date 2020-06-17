package JavaPrac;

import java.util.HashMap;
import java.util.Map;

public class HashCodeString {

	int id;
	String name;
	
	HashCodeString(String name, int id){
		this.id=id;
		this.name=name;
	}

	
	
	



	public static void main(String[] args) {

		HashCodeString obj1 = new HashCodeString("Ehsan", 100);
		HashCodeString obj2 = new HashCodeString("Ehsan", 100);
		
//		System.out.println(obj1.hashCode());
//		System.out.println(obj2.hashCode());
		
		HashMap<HashCodeString, Integer> map = new HashMap<HashCodeString, Integer>();
		map.put(obj1, 1);
		map.put(obj2, 2);
		
		for(Map.Entry n: map.entrySet()) {
		System.out.println(n.getKey()+"  "+n.getValue());
		}
		
		
		

		
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
		HashCodeString other = (HashCodeString) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}







	@Override
	public String toString() {
		return String.format("HashCodeString [id=%s, name=%s]", id, name);
	}

}
