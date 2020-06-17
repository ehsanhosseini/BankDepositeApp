
public class ListOfArray {

	int id;
	String name;
	
	
	
	public ListOfArray(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



	@Override
	public String toString() {
		return String.format("ListOfArray [id=%s, name=%s]", id, name);
	}
	
	
	
}
