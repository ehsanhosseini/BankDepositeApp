import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;


class StudentNew {
	int rollNum;
	String name;
	String city;	
	public StudentNew(int rollNum, String name, String city) {
		this.rollNum = rollNum;
		this.name = name;
		this.city = city;
	}
	
}
class CompareName implements Comparator<StudentNew>{
	public int compare(StudentNew n1, StudentNew n2) {
		
		return n1.name.compareTo(n2.name);
	}
}

class CompareAge implements Comparator<StudentNew>{
	public int compare(StudentNew st1, StudentNew st2) {
		if(st1.rollNum==st2.rollNum)
			return 0;
		else if(st1.rollNum>st2.rollNum)
			return 1;
		else 
			return -1;
		
	}
	
}
	
	public class TreeSetExample{
	public static void main(String args[]) {
		
		
	TreeSet<StudentNew> set = new TreeSet<StudentNew>(new CompareName());	
	
	
	set.add(new StudentNew(100,"Ehsan","Saravan"));
	set.add(new StudentNew(99,"Ahmad","Saravan"));
	set.add(new StudentNew(10,"Majed","Cahnabhar"));
	System.out.println("Name Compare:");
		for(StudentNew str:set) {
			
			System.out.println(str.rollNum+" "+str.name+" "+str.city);
		}
		
		TreeSet<StudentNew> set1 = new TreeSet<StudentNew>(new CompareAge());	
		
		
		set1.add(new StudentNew(100,"Ehsan","Saravan"));
		set1.add(new StudentNew(99,"Ahmad","Saravan"));
		set1.add(new StudentNew(10,"Majed","Cahnabhar"));
		System.out.println("Age Compare:");
			for(StudentNew str:set1) {
				
				System.out.println(str.rollNum+" "+str.name+" "+str.city);
			}
		
	}	

	
}	
	
	

