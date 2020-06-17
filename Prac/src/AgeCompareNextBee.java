import java.util.Comparator;

public class AgeCompareNextBee implements Comparator<Member> {

	public int compare(Member m1, Member m2) {
		
		if (m1.age>m2.age)
			return 1;
		if(m1.age==m2.age)
			return 0;
		else 
			return -1;		
	}

}
