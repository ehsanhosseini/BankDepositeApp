
class Member {
	
	String email;
	int age;
	String gender;
	
	Member(String email, int age, String gender){
		
		this.email = email;
		this.age  = age;
		this.gender = gender;	

}

	
	
	@Override
	public String toString() {
		return "Member [age=" + age + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (age != other.age)
			return false;
		return true;
	}
}
