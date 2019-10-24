import java.util.Scanner;
class seven {
	public static void main (String[] args){
	Scanner in = new Scanner(System.in);
	System.out.println("enter first number -:");
	int num1=in.nextInt();
	System.out.println("enter second number -:");
	int num2 = in.nextInt();
	int sum=0;
	for (int i =num1 ; i<=num2 ;i++){
		sum=sum+i;
	}
	
	System.out.println(sum);
}
}
