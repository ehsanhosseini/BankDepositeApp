import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {


		TreeSet<Student> set1=new TreeSet<Student>(new NameCompare());  
		 
		set1.add(new Student(101,"Vijay",23));  
		set1.add(new Student(106,"Ajay",27));  
		set1.add(new Student(105,"Jai",21));  
		System.out.println("Name Compare:");
		 
		for(Student st:set1){
		System.out.println(st.rollNum+" "+st.name+" "+st.age);  
		}  
		
		TreeSet<Student> set2=new TreeSet<Student>(new AgeCompare()); 
		set2.add(new Student(101,"Vijay",23));  
		set2.add(new Student(106,"Ajay",27));  
		set2.add(new Student(105,"Jai",21));  
		System.out.println("Age Compare:"); 
	
		for(Student st:set2){
		System.out.println(st.rollNum+" "+st.name+" "+st.age);  
		}  

		
	}

}
