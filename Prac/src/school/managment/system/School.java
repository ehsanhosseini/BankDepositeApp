package school.managment.system;

import java.util.List;

public class School {

	private List<Teacher> teachers;
	private List<Student> students;
	private static int totalMoneyEarned;
	private static int totalMoneySpent;
	
	
	
	public School(List<Teacher> teachers, List<Student> students) {
		totalMoneyEarned = 0;
		totalMoneySpent = 0;
		this.teachers = teachers;
		this.students = students;
	}
	
	
	public List<Teacher> getTeachers() {
		return teachers;
	}
	public void addTeachers(Teacher teacher) {
		teachers.add(teacher);
	}
	
	
	public List<Student> getStudents() {
		return students;
	}
	public void addStudents(Student student) {
		students.add(student);
	}
	
	/**
	 * Total money earned by school
	 * @return
	 */
	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}
	public static void updateTotalMoneyEarned(int moneyEarned) {
		totalMoneyEarned += moneyEarned;
	}
	
	/**
	 * Total money spent by school
	 * School spend money just for teacher salary
	 * @return
	 */
	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}
	public static void updateTotalMoneySpent(int moneySpent) {
		totalMoneyEarned -= moneySpent; 
	}
	
	
	
	
	
}
