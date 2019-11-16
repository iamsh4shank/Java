import java.util.Scanner;
class PurchaseProduct {
    private String name;
    private double unitPrice;
    PurchaseProduct( String name , double unitPrice){
        this.name = name ;
        this.unitPrice = unitPrice;
    } 
    PurchaseProduct(){
        this.name = "no product";
        this.unitPrice = 0.0;
    }
    double getPrice() {
        return this.unitPrice;
    }
    String getName(){
        String var = this.name + "@" +" "+ this.unitPrice;
        return var; 
    }
}

class WeighedProduct extends PurchaseProduct {
    private double weight;
    WeighedProduct (String name , double unitPrice , double weight){
        super(name, unitPrice);
        this.weight = weight;
    }
    double getPrice() {
        double price = this.weight*(super.getPrice());
        return price;
    }
    String getValue() {
        String val = super.getName() + " " +this.weight + "Kg "+"Rs "+this.getPrice() ;
        return val;
    }
}

class CountedProduct extends PurchaseProduct{
    private int quantity;
    CountedProduct(String name, double unitPrice , int quantity){
        super(name , unitPrice);
        this.quantity = quantity;
    }
    double getPrice() {
        double price1 = this.quantity*(super.getPrice());
        return price1;
    }
    String getValue() {
        String val = super.getName() + " " + this.quantity + "units "+"Rs. "+this.getPrice() ; 
        return val;
    }
}

class P1_2 {
    public static void main(String[] args){
        WeighedProduct obj1 = new WeighedProduct("Banana ", 3.00, 1.37);
        String value = obj1.getValue();
        System.out.println(value);

        CountedProduct obj2 = new CountedProduct("Pens", 4.5, 10);
        String value1 = obj2.getValue();
        System.out.println(value1);

    }
}