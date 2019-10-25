class Vehicle
{
    int modelnumber;
    String type;
    
    public void input(int modelnumber , String type)
    {
        this.modelnumber = modelnumber;
        this.type = type ;
    }
    public void output()
    {
        System.out.println(modelnumber);
        System.out.println(type);
    }
}
class Car extends Vehicle
{
    int noOfWheel;
    int noOfSeat;

    void Car() 
    {
        noOfSeat = 43567;
        noOfWheel = 34567;
        
    }
    
    public void inputC(int noOfWheel , int noOfSeat , int modelnumber ,String type )
    {
        this.noOfSeat = noOfSeat;
        this.noOfWheel = noOfWheel;
        super.input(modelnumber,type);

    }
    public void outputC()
    {
        System.out.println("number of seat are-" + noOfSeat);
        System.out.println("number of wheel are-" + noOfWheel);
        super.output();
    }
}

class Inheritance
{
    public static void main(String[] args){
        Car c1 = new Car();
        Car c2 = new Car();
        c1.inputC(4, 6, 123, "Car"); 
        c2.inputC(2, 2, 234, "Bike"); 

        c1.outputC();
        c2.outputC();
    }
}

 

