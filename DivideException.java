package lab9;

public class DivideException {

	public static void main(String[] args) {
		
		division(100,4);     
        division(100,0);       
        System.out.println("Exit main().");

	}
	
	public static void division(int totalSum, int totalNumber) {
        System.out.println("Computing Division.");
        int average  = totalSum/totalNumber;
        System.out.println("Average : "+ average);
    }

}


