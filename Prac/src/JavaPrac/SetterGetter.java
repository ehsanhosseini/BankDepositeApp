package JavaPrac;

import java.util.ArrayList;
import java.util.List;



public class SetterGetter {
	
	 private List<Person> listPeople; 
	   
//	    public void setListPeople(List<Person> list) { 
//	        this.listPeople = new ArrayList<Person>(list); 
//	    } 
//	   
//	    public List<Person> getListPeople() { 
//	        return new ArrayList<Person>(this.listPeople); 
//	    } 
//	
	public List<Person> getListPeople() {
		return listPeople;
	}

	public void setListPeople(List<Person> listPeople) {
		this.listPeople = listPeople;
	}





	public static void main(String[] args) {
		
		SetterGetter obj = new SetterGetter();
		
		List<Person> list = new ArrayList<Person>();
		
		list.add(new Person("Ehsan"));
		list.add(new Person("Majewd"));
		list.add(new Person("Hamid"));
		
		obj.setListPeople(list);
		System.out.println(obj.getListPeople());
	
		list.get(0).setName("Jimi");
		System.out.println(obj.getListPeople());
		
	 	
//		obj.setListPeople(list);
//		System.out.println("List1: "+list);
//		
//		list.get(0).setName("Hosseini");
//		List<Person> list2 = obj.getListPeople();
//		System.out.println("List2: "+list2);
//		
		
	
		
		
	}

}
