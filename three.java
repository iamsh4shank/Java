import java.util.Scanner;
class three{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value -:");
		int val=in.nextInt();
		if (val%5==0){
			System.out.println(val/5);
		}
		
		else{
			System.out.println((val/5)+1);
		}
	}
}
