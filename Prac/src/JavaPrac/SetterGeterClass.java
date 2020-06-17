package JavaPrac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetterGeterClass {
	

	private List<String> listTitles;
	

//	public List<String> getName() {
//		return listTitles;
//	}
//
//	public void setName(List<String> titles) {
//		this.listTitles = titles;
//	}
	
	

	public List<String> getName() {
		return new ArrayList<String>(this.listTitles);
	}

	public void setName(List<String> name) {
		this.listTitles = new ArrayList<String>(name);
	}
	
	
	
	
	
}
