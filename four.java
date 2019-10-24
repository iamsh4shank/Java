import java.util.Scanner;
class four {
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("enter your first number-:");
		int num1=in.nextInt();
		System.out.println("enter your second number-:");
		int num2=in.nextInt();
		for (int i = num1 ; i<=num2 ; i++){
			System.out.println(i);
		}
	}
}
