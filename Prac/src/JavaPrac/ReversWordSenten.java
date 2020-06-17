package JavaPrac;

public class ReversWordSenten {

	public static void main(String[] args) {
		String str = "Ehsan";
		
	//String builder = ""; 
		StringBuilder builder = new StringBuilder();
		for(int i = str.length()-1; i>=0; i--) {
				builder = builder.append(str.charAt(i));
			
		}
		System.out.println(builder);

	}

}
