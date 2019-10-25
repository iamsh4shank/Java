import java.util.Scanner;
class weird   {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num%2!=0){
            System.out.println("Weird");
        }
        if (num%2==0) {
            if (num>=2 && num<=5){
                System.out.println("Not Weird");
            } 
            if (num>5 && num<=20) {
                System.out.println("Weird");
            }
            if (num>20) {
                System.out.println("Not Weird");
            }
        }
    }
}