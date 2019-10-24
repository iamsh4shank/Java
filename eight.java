import java.util.Scanner;
class eight {
	public static void main(String[] args){
	Scanner in = new Scanner(System.in);	
	System.out.println("enter the number-:");
	int num =in.nextInt();
	int sum=0;
	for (int i =1; i<=num ; i++){
		if ( num%i==0){
			sum=sum+i;
		}
	}
	System.out.println(sum);	
	}
}
