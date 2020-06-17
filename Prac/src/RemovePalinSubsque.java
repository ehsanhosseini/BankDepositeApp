import java.util.Arrays;

public class RemovePalinSubsque {

	public static void balloon(String str) {
		
		char[] ch = str.toCharArray();
		StringBuilder alphabet = new StringBuilder();
//		for(int i=0; i<str.length(); i++ ) {
//			if(str.charAt(i)=='b' || 
//					str.charAt(i)=='a' ||
//					str.charAt(i)=='l' ||
//					str.charAt(i)=='o' ||
//					str.charAt(i)=='n') {
				
				Arrays.sort(ch);
				
			for(char c:ch) {
				alphabet.append(c);
				if(alphabet.charAt(0)=='a') {
					System.out.print("One");	
					break;
				}
				else {
					System.out.print("Zero");
				}
				
			}	
//		return str;
	}
	public static void main(String[] args) {
		//abllnoo
		String str = "loonbalxballpoon";
		balloon(str);
	}
}
