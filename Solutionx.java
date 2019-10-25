class Vehicle{  
    //defining a method  
  
    void run(){System.out.println("Vehicle is running");}  
    
} 

  //Creating a child class  
  class Bike2 extends Vehicle{  
    //defining the same method as in the parent class  
    void run(){System.out.println("Bike is running safely");}  
    
    public static void main(String args[]){  
    Bike2 obj = new Bike2();
    Bike1 obj1 = new Bike1();
    obj1.run();
    obj.run();//calling method  
    }  
  }  