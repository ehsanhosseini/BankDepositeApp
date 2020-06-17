package JavaPrac;



public class InterfaceEx implements Shape,Shap3 {

	public void triagle() {
		System.out.println("We are in tringle");
	}
	
	public void circle() {
		System.out.println("We are in circle");
	}
	
	public static void main(String[] args) {
		
		InterfaceEx obj = new InterfaceEx();
		obj.circle();
		

	}

}
