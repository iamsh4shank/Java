
interface Shape  {
    String color = "no color";
    public double perimeter();
    public double area();
    public String tostring();
    public String getColor();

}

class Circle implements Shape {
    private double radius ;
    Circle( double radius){
        this.radius = radius;
    }
    public double area() {
        double areaF = 3.14*this.radius*this.radius;
        return areaF;
    }
    public double perimeter() {
        double periF = 2*3.14*this.radius;
        return periF;       
    }
    public String tostring() {
        String toS = String.valueOf(this.area());
        return toS;
    }
    public String getColor() {
        String colorF = Shape.color;
        return colorF;
    }
}

class Rectangle implements Shape {
    private double length ;
    private double width ;
    Rectangle(double length , double width){
        this.length = length;
        this.width = width;
    }
    public String tostring() { 
        String toSt = String.valueOf(this.area());
        return toSt;   
    }
    public double area() {
        double areaR = this.length*this.width;
        return areaR;
    }
    public double perimeter() {
        double periR = 2*(this.length+this.width);
        return periR;       
    }
    public String getColor() {
        String colorR = Shape.color;
        return colorR;
}
}

class P4 {
    public static void main(String[] args){
        Circle c = new Circle(5);
        double aC = c.area();
        Rectangle r = new Rectangle(5, 3);
        double aR = r.area();
        System.out.println("Area of Circle is -" + c.area()+" Color of circle is -"+ c.getColor()+ " Perimeter of circle is -"+ c.perimeter());
        System.out.println("Area of rectangle is -" + r.area()+" Color of rectangle is -"+ r.getColor()+ " Perimeter of rectangle is -"+ r.perimeter()); 
    }
}