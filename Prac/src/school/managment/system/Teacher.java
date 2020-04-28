package school.managment.system;

public class Teacher {
	
	private int id;
	private String name;
	private int salary;
	private int earnSalary;
	
	public Teacher(int id, String name, int salary) {
		this.salary = salary;
		this.id = id;
		this.name = name;
		this.earnSalary = 0;
	}

	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}
	// teacher may withraw 500 today but maybe she withraw more some another day when she has more experiance
	public void setSalary(int salary) {
		this.salary = salary; 
	}
	
	/**Add to salary earned
	 * remove total money earned from school
	 * @param salary
	 */
	public void receivedSalary(int salary) {
		earnSalary += salary; 
		 School.updateTotalMoneySpent(salary);
	}
	
	
}	