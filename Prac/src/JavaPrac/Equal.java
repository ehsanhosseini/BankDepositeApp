package JavaPrac;

public class Equal {

	String name;
	Equal(String name){
		this.name = name;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Equal other = (Equal) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}



	public static void main(String[] args) {
		
//		String s1 = new String("Ehsan");
//		String s2 = new String("Ehsan");
//		
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
//		
		
		
		Equal obj = new Equal("Ehsan");
		Equal obj2 = new Equal("Ehsan");

		System.out.println(obj.hashCode());
		System.out.println(obj2.hashCode());

		if(obj.equals(obj2)) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not equal");
		}
}
}
