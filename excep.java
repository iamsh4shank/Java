import java.util.InputMismatchException;
import java.util.Scanner;
class excep {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int div = 0;
        try {
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            div = num1/num2;
        }
        catch (InputMismatchException e ) {
            System.out.println("input should be integer");
        }
        catch (ArithmeticException a) {
            System.out.println("denominator should not be zero");
        }
        int sum = 0;
        for (int  i = 1 ; i<= div ; i++){
                sum = sum + i ;
        }
        System.out.println(sum);
    }
}