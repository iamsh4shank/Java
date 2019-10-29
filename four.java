import java.util.Scanner;
class four{
	public static void main(String[] args){
	Scanner in =new Scanner(System.in);
	int row = in.nextInt();
	int col = in.nextInt();
	int matrix[][];
	matrix=new int[row][col];
	System.out.println("enter the element of first matrix one by one-:");
	for (int i= 0 ; i<row ; i++){
		for (int j=0 ;j<col ;j++){
			matrix[i][j]=in.nextInt();
		}
	}
	System.out.println("enter the scalar-:");
	int scalar= in.nextInt();
	for (int i=0 ;i<row ; i++){
		for (int j=0 ;j<col ;j++){
			matrix[i][j]=matrix[i][j]*scalar;
		}
	}
	System.out.println("matrix after scalr multiplication is-:");
	for(int i =0 ; i<row ; i++){
		for (int j=0 ;j<col ;j++){
		System.out.println(matrix[i][j]);
		}
		System.out.println("\n");
	}	
	

}
}
