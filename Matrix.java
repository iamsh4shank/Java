import java.util.Scanner;
class MatrixCalculation
{
	int row;
	int col;
	int arr[][];
	int sum[][];

	Matrix ()  
	{
		row = 0;
		col = 0;
	}
	Matrix (int r, int c)
	{
		row = r;
		col = c;
		arr = new int[r][c];
		sum = new int[r][c];
		for( int i = 0 ; i<r ; i++)
		{
			for ( int j = 0 ; j<c ; j++)
			{
				arr[i][j] = 0;
				sum[i][j] = 0;
			}
		}

	}

	Matrix ( int r , int c , int a )
	{
		row = r;
		col = c;
		arr = new int[r][c];
		for (int i = 0 ; i<r ; i++)
		{
			for ( int j = 0 ; j<c ; j++)
			{
				arr[i][j] = a ;
			}
		}

	}

	void read()
	{
		Scanner f= new Scanner(System.in);
		System.out.println("enter the number of rows");
		int r = f.nextInt();
		System.out.println("enter the number of columns");
		int c = f.nextInt();
		arr = new int[r][c];
		for (int i =0 ; i<r ; i++)
		{
			for (int j = 0 ; j<c ; j++)
			{
				Scanner in = new Scanner(System.in);
				arr[i][j]=in.nextInt();
			}
		}
	}

	void mul ()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number of rows");
		int r = scan.nextInt();
		System.out.println("enter the number of columns");
		int c = scan.nextInt();
		for (int i = 0 ; i<r ; i++)
		{
			for(int j = 0; j<c ;j++)
			{
				arr[i][j] = scan.nextInt();
			}
		}

		System.out.println("enter scalar");
		int m = scan.nextInt();
		for (int i =0 ; i<r ;  i++)
		{
			for (int j = 0 ; j<c ; j++)
			{
				arr[i][j] = m*arr[i][j];
			}
		}
	}
	void add(Matrix mat)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter rows");
		int r = scan.nextInt();
		System.out.println("enter columns");
		int c = scan.nextInt();
		for (int i = 0 ; i<r ; i++)
		{
			for(int j = 0; j<c ;j++)
			{
				arr[i][j] = scan.nextInt();
			}
		}
		for (int i=0 ; i<r ; i++)
		{
			for ( int j =0 ; j<c ;j++)
			{
				arr[i][j]=arr[i][j]+ mat.arr[i][j];
			}
		}
		for (int i=0 ; i<r ; i++)
		{
			for( int j =0 ; j<c ; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
		System.out.print("\n");
		}
	}
}
public class Matrix
{
	public static void main(String[] args)
	{
		System.out.println("enter first matrix");
		Matrix m = new Matrix();
		m.read();
		Matrix a = new Matrix();
		a.read();
		System.out.println("enter second matrix ");
		a.add(m);
		Matrix d =new Matrix();
		d.mul();
	}
}	
				

	 
