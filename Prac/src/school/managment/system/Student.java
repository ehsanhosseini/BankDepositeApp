package school.managment.system;

public class Student {
	
	private int id;
	private int grade;
	private int feesPaid;
	private int feesTotal;
	private String name;
	
	/**
	 * 
	 * @param id
	 * @param grade
	 * @param name
	 */
	public Student(int id, String name, int grade) {
		
		this.feesPaid = 0;    // before any payment 
		this.feesTotal = 30000;	// Total fees per student
		this.id = id;
		this.grade = grade;
		this.name = name;
	}
	
	
	// return remaining fees
		public int getRemainingFees() {
			
			 return feesTotal - feesPaid;
		}
	
	/**
	 * Fees that students pay
	 * @param fees
	 */
	public void payFees(int fees) {
		feesPaid += fees;
		School.updateTotalMoneyEarned(feesPaid);
	}

	public int getId() {
		return id;
	}

	public int getGrade() {
		return grade;
	}
	/**
	 * student grade may change so we need to set the grade it we want to change it in future
	 * @param grade 
	 */
	public void setGrade(int grade) {
		
		this.grade =  grade;
	}
	

	public int getFeesPaid() {
		return feesPaid;
	}

	public int getFeesTotal() {
		return feesTotal;
	}

	public String getName() {
		return name;
	}	
	
	public String toString() {
		return "Name:"+name+ "  Id:"+id+"   Total Fees paid:"+feesPaid; 
	}
	
}
