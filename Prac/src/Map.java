import java.util.HashMap;
import java.util.Map;

 class StudentMap {

	int rollNum;
	String name;
	int age;
	public StudentMap(int rollNum, String name, int age){
		this.rollNum = rollNum;
		this.name = name;
		this.age = age;
	}
}
public class Map{
	public static void main(String[] args) {
		
		Map<Integer,StudentMap> map = new HashMap<Integer, StudentMap>();
		map.put(1, new StudentMap(100,"Ehsan", 33));
		map.put(2, new StudentMap(99,"Ahmad", 30));
		map.put(3, new StudentMap(101,"Jimi", 25));
		
		for(Map.Entry<Integer, StudentMap> m:map.entrySet()) {
			int key = m.getKey();
			StudentMap value = m.getValue();
			System.out.println( key+":"+ value.rollNum+" "+value.name+" "+value.age );
			
			
		}
	}

}
