class Vehicles
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
class Cars extends Vehicles
{
    int noOfWheel;
    int noOfSeat;

    void Cars() 
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
        System.out.println("Number of seat are-" + noOfSeat);
        System.out.println("Number of wheel are-" + noOfWheel);
        super.output();
    }
}

class Inheritance
{
    public static void main(String[] args){
        Cars c1 = new Cars();
        Cars c2 = new Cars();
        c1.inputC(4, 6, 123, "Car"); 
        c2.inputC(2, 2, 234, "Bike"); 

        c1.outputC();
        c2.outputC();
    }
}

 

