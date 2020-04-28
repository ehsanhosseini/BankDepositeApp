package school.managment.system;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		
		List<Student> studentList = new ArrayList<Student>();
		Student ehsan = new Student(1, "Ehsan", 12);
		Student majed = new Student(2, "Majed", 10);
		Student jimi = new Student(3, "Jimi", 2);
		Student hamid = new Student(4, "Hamid", 1);
		studentList.add(ehsan);
		studentList.add(majed);
		studentList.add(jimi);
		studentList.add(hamid);
		
		
		List<Teacher> teacherList = new ArrayList<Teacher>();
		Teacher chiana = new Teacher(1, "Chiana", 1000);
		Teacher mary = new Teacher(2, "Mary", 100);
		Teacher ray = new Teacher(3, "Ray", 500);
		teacherList.add(chiana);
		teacherList.add(mary);
		teacherList.add(ray);
		
		
		School fgs = new School(teacherList, studentList);
		
		
		ehsan.payFees(500);
		System.out.println("Ehsan fees paid: $"+ehsan.getFeesPaid());
		System.out.println("Ehsan remaining fees is: $"+ehsan.getRemainingFees());
		
		majed.payFees(6000);
		System.out.println("Majed fees paid: $"+majed.getFeesPaid());
		System.out.println("Majed remaining fees is: $"+majed.getRemainingFees());
		
		System.out.println("FGS earned: $" +fgs.getTotalMoneyEarned());
		
		
		System.out.println("----------Teachers Salary---------");
		
		chiana.receivedSalary(chiana.getSalary());
		System.out.println("FGS has spend salary to "+chiana.getName()+" and now has " + fgs.getTotalMoneyEarned());
		
		mary.receivedSalary(mary.getSalary());
		System.out.println("FGS has spend salary to "+mary.getName()+" and now has " + fgs.getTotalMoneyEarned());
		
		System.out.println(ehsan);

	}

}
