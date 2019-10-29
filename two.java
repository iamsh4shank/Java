import java.util.Scanner;
class two {
	public static void main (String[] args) {
	int a = 1;
        int b = 1;
	Scanner in = new Scanner (System.in);
	System.out.print ("Enter the number whose power you want to know: ");
	int inp = in.nextInt();
        int arr [];
        arr =new int [inp];
	for (int i = 0; i < inp; i++){
        	a = 1;
		for (int j = 0; j <= i; j++){
			System.out.print (a + " ");
                    	a = a * (i - j) / (j + 1);
                    	if (i == inp){
                        arr[0] = 1;
                        arr[b] = a;
                        b = b + 1;
                    	}
		}
			System.out.println ();
	}
        }
}
