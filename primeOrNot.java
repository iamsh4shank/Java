import java.util.Scanner;
class primeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num;
        do{
        System.out.println("Enter the no.: ");
        num = sc.nextInt();
        }while(num <= 1 );
        
        boolean isPrime = true;
        
        for(int i = 2; i * i <= num; i++){
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime)
            System.out.println(num + " is prime.");
        else
            System.out.println(num + " isn't prime.");
    }
            
}           
