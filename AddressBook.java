import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
class Info {
    String name;
    String houseName;
    String streetAddress;
    String city;
    String state;
    String country;
    String pinCode;
    Info (String name, 
                    String housename,
                    String streetAddress, 
                    String city,
                    String state, 
                    String country,
                    String pinCode) {
        this.name = name;
        this.houseName = housename;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pinCode = pinCode;
    }
    void setName(String name) {
        this.name = name;
    }
    void setStreetAdress(String streetaddress){
        this.streetAddress = streetaddress;
    }
    void setHouseName( String housename) {
        this.houseName = housename ;
    }
    void setCity(String city) {
        this.city = city;
    }
    void setState(String state) {
        this.state = state;
    }
    void setCountry (String country) {
        this.country = country;
    }
    void setPincode(String pincode) {
        this.pinCode = pincode;
    }
    String getName() {
        return name;
    }
    String getStreetAdress(){
        return streetAddress;
    }
    String getHouseName() {
        return houseName ;
    }
    String getCity() {
        return city;
    }
    String getState() {
        return state;
    }
    String getCountry () {
        return country;
    }
    String getPincode() {
        return pinCode;
    }
    void disp(AbstractList address, Info d){
        for(int i =0 ; i< address.size() ;i++){
            System.out.println(address.get(i));
            System.out.println("Address number "+(i+1));
            System.out.println("Name is-:"+d.getName());
            System.out.println("House name is-:"+d.getHouseName());
            System.out.println("Street address is-:"+d.getStreetAdress());
            System.out.println("City name is-:"+d.getCity());
            System.out.println("State name is-:"+d.getState());    
            System.out.println("Country name is-:"+d.getCountry());    
            System.out.println("Pincode is-:"+d.getPincode());    

        }
    }
    void delete(AbstractList address , int num){
        if (address.size() == 0){
            System.out.println("enter no address is found in address book");
        }
        address.remove(num-1);
        System.out.println("Deleted successfully");

    }    
}

class AddressBook {
    public static void main(String[] args) {
        Info newPerson = new Info("xyz", "q","w", "e","r" ,"t" ,"y");
        ArrayList<Info> address = new ArrayList<Info>();
        Scanner sc = new Scanner(System.in);
        AddressBook person = new AddressBook();
        while (1>0){
            
            System.out.println("         Address Book Menu");
            System.out.println("         =================");
            System.out.println("  -->Enter 1 to Add Person Address ");
            System.out.println("  -->Enter 2 to Delete Person Address ");
            System.out.println("  -->Enter 3 to count number of addresses");
            System.out.println("  -->Enter 4 to display all the address stored ");
            System.out.println("  -->Enter 5 to exit");
            System.out.print("Please enter your choice: ");
            int choice = sc.nextInt();
            while ((choice != 1) && (choice != 2) && (choice != 3) && (choice !=4) && (choice !=5)) {
                System.out.println("Invalid choice!  Please select Add, Delete, Count, Exit: ");
                choice = sc.nextInt();
            }   
            if (choice  == 1) {      
                System.out.println("To add a person, follow the prompts.");

                System.out.print("Enter Fullname: ");
                sc.next();
                newPerson.setName(sc.nextLine());

                System.out.print("Enter House Name: ");
                newPerson.setHouseName(sc.nextLine());

                System.out.print("Enter Street name: ");
                newPerson.setStreetAdress(sc.nextLine());

                System.out.print("Enter City: ");
                newPerson.setCity(sc.nextLine());
                
                System.out.print("Enter State: ");
                newPerson.setState(sc.nextLine());

                System.out.print("Enter Country: ");
                newPerson.setCountry(sc.nextLine());

                System.out.print("Enter Pincode: ");
                newPerson.setPincode(sc.nextLine());

                address.add(new Info(newPerson.getName(), newPerson.getHouseName(), newPerson.getStreetAdress(), 
                            newPerson.getCity(), newPerson.getState(), newPerson.getCountry(), newPerson.getPincode()));
                System.out.println("\nYou have successfully added a new person!");
                System.out.println("\n");
            }

            if (choice == 3){
                System.out.print("Total number of addresses are -: ");
                System.out.println(address.size());
                
            }
            if (choice == 4){
                System.out.println("Address book is ");
                newPerson.disp(address , newPerson);

            }
            if (choice == 2){
                System.out.println("enter which address you want to delete");
                int f = sc.nextInt();
                newPerson.delete(address,f);
            }
            if (choice ==5) {
                System.exit(0);
            }
        } 
    }
}
    

    
    

    




