import java.util.Scanner;
class five {
	public static void main(String[] args){
	Scanner in =new Scanner(System.in);
	int row = in.nextInt();
	int col = in.nextInt();
	int matrix1[][];
	int matrix2[][];
	int matrix3[][];
	matrix1= new int[row][col];
	matrix2= new int[row][col];
	matrix3= new int[row][col];
	System.out.println("enter the element of first matrix one by one-:");
	for (int i = 0 ; i<row ; i++){
		for (int j =0 ;j<col ;j++){
			matrix1[i][j]=in.nextInt();
		}
	}
	System.out.println("enter the element of second matrix ony by one-:");
	for (int i = 0 ; i<row ; i++){
		for (int j =0 ;j<col ;j++){
			matrix2[i][j]=in.nextInt();
		}
	}
	for (int i=0 ; i<row ; i++){
		for (int j = 0 ;j<col ;j++){
			matrix3[i][j]=matrix1[i][j]+matrix2[i][j];
		}
	}
	System.out.println("final matrix after sum is ");
	for(int i =0 ; i<row ; i++){
		for (int j =0; j<col ; j++){
			System.out.println(matrix3[i][j]+" ");
		}
		System.out.println("\n");
	}

}
}
