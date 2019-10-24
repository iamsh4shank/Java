import java.util.Scanner;
class five {
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("enter number-:");
		int num1=in.nextInt();
		for (int i = 1; i<=num1; i++){
			if (num1%i==0){
				System.out.println(i);
			}
		}
	}
}
