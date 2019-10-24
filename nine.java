import java.util.Scanner;
class nine {
	public static void main(String[] args){
	Scanner in =new Scanner(System.in);
	System.out.println("enter the first number-:");
	int num1=in.nextInt();
	System.out.println("enter the second number-:");
	int num2 = in.nextInt();
	int sum = 0;
	for (int i =num1 ; i<=num2 ;i++){
		for (int j =1 ;  j<=num2 ; j++){
			if (i%j ==0){
				sum=sum+j; 
			}
		}
	}
	System.out.println(sum);
	}
}

