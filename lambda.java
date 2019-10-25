import java.util.Scanner;
interface Calculator 
{
    int getNum(int a , int b);

    
}
interface Hello
{
    String hello(String h);
}

public class lambda
{
    public static void main (String[] args)
    {
        Calculator add = (int x ,int y) -> x+y;
        Calculator sub = (int x , int y) -> x-y;
        Hello name = (String str) -> {return "Hello "+ str ;};
        System.out.println(sub.getNum(4,5));
        System.out.println(add.getNum(4,5));
        name.hello("Ram");
        System.out.println(name.hello("Shyam") + "your sum is- "+add.getNum(4,5)+"your sub is- " + sub.getNum(4,5));

        
    }
}
