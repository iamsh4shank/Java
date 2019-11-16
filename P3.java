
abstract class Shape  {
    String color;
    Shape(String color) {
        this.color = color;
    }
    abstract double area();
    abstract String tostring();
    abstract String getColor();
}

class Circle extends Shape {
    double radius ;
    Circle (String color , double radius){
        super(color);
        this.radius = radius;
    }
    double area() {
        double areaF = 3.14*this.radius*this.radius;
        return areaF;
    }
    String tostring() {
        String toS = String.valueOf(this.area());
        return toS;
    }
    String getColor() {
        String colorF = super.color;
        return colorF;
    }
}

class Rectangle extends Shape {
    double length ;
    double width ;
    Rectangle(double length , double width , String color) {
        super(color);
        this.length = length;
        this.width = width ;
    }
    String tostring() {
        String toSt = String.valueOf(this.area());
        return toSt;
    }
    double area() {
        double areaR = this.length*this.width;
        return areaR;
    }

    String getColor() {
        String colorR = super.color;
        return colorR;
    
}
}

class P3 {
    public static void main(String[] args){
        Circle c = new Circle("red", 5);
        double aC = c.area();
        Rectangle r = new Rectangle(5, 3, "blue");
        double aR = r.area();
        System.out.println("Area of Circle is -" + c.area()+" Color of circle is -"+ c.getColor());
        System.out.println("Area of rectangle is -" + r.area()+" Color of rectangle is -"+ r.getColor()); 
    }
}