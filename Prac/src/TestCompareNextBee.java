import java.util.TreeSet;

public class TestCompareNextBee {

	public static void main(String[] args) {
		
		TreeSet<MemberNextBee> set=new TreeSet<MemberNextBee>(); 
		set.add(new MemberNextBee("eh@gma.com",20, "Male"));  
		set.add(new MemberNextBee("shf@gma.com",20, "Female"));  
		set.add(new MemberNextBee("wers@gma.com",25, "Female"));  
		System.out.println("Age Compare:"); 
	
		for(MemberNextBee s:set){
		System.out.println(s.email+" "+s.age+" "+s.gender);  
		}  

		
		
	}

}
