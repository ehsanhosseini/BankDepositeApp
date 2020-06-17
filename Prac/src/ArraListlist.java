import java.util.ArrayList;
import java.util.Arrays;

public class ArraListlist {

	
	

	public static void main(String[] args) {
		
		ArrayList<ListOfArray> list = new ArrayList<ListOfArray>();
		list.add(new ListOfArray(12,"Ehsan"));
		list.add(new ListOfArray(123,"Hosseini"));
		
		Arrays.asList(list);
		
		System.out.println(list);

	}

}
