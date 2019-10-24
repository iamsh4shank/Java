import java.util.Scanner;
class six {
	public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	System.out.println("enter the number-:");
	int num = in.nextInt();
	for (int i = 1 ; i<=num ;i++){
		System.out.println("The factors of"+ i+"are");
		for (int j= 1 ; j<=num ; j++) {
			if (i%j==0){
				System.out.println(j);
			}
		}
	}
	}
}
			
