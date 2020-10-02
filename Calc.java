import java.util.Scanner;
interface Area 
{
    
    void calcArea();
    
}
interface ShowArea
 {
     void showArea();
 }
class Square implements Area,ShowArea{
    
    Double area;
    Scanner in = new Scanner(System.in);
    public void calcArea()
    {
        Double x = in.nextDouble();
        area = Math.pow(x,2);
    }
    public void showArea()
    {
        System.out.println("Area of Square is- "+area);
    }
}

class Rect implements Circle{
  
    Double area;
    Scanner scan = new Scanner(System.in);
    public void calcArea()
    {
        Double r = scan.nextDouble();
        area = Math.PI*r*r;
    }
    public void showArea()
    {
        System.out.println("Area of Circle is- "+area);
    }
    
}

class Rect implements Area{
  
    Double area;
    Scanner scan = new Scanner(System.in);
    public void calcArea()
    {
        Double x = scan.nextDouble();
        Double y = scan.nextDouble();
        area = x*y;
    }
    public void showArea()
    {
        System.out.println("Area of rectangle is- "+area);
    }
    
}

class calc
{
    public static void main(String[] args){
        Square s = new Square();
        Rect r = new Rect();
        s.calcArea();
        s.showArea();
        r.calcArea();
        r.showArea();
    }
}

