import java.util.*;
import java.io.*;


class Doctor implements Serializable {
    private String doctorName;
    private String doctorSpeciality;
    private String doctorID;
    private String doctorMobNum;
    private String  doctorStatus;
    private String doctorRoomNum ;
    Doctor(String doctorName, String doctorSpeciality, String doctorID , String doctorMobNum , String doctorStatus , String doctorRoomNum){
        this.doctorName=doctorName;
        this.doctorSpeciality=doctorSpeciality;
        this.doctorID = doctorID;
        this.doctorMobNum = doctorMobNum;
        this.doctorStatus = doctorStatus;
        this.doctorRoomNum = doctorRoomNum;
    }
    public void setName (String doctorName) {
        this.doctorName = doctorName;
    }
    public void setSpeciality( String doctorSpeciality){
        this.doctorSpeciality = doctorSpeciality;
    }
    public void setDoctorID(String doctorID) {
        this.doctorID = doctorID;
    }
    public void setDoctorMobNum(String doctorMobNum){
        this.doctorMobNum = doctorMobNum;
    }
    public void setDoctorStatus(String doctorStatus){
        this.doctorStatus = doctorStatus;
    }
    public void setDoctorRoomNum(String doctorRoomNum){
        this.doctorRoomNum = doctorRoomNum;
    }

    public String getDoctorName(){
        return doctorName;
    }
    public String getDoctorspeciality(){
        return doctorSpeciality;
    }
    public String getDoctorID() {
        return doctorID;
    }
    public String getDoctorMobNum() {
        return doctorMobNum;
    }
    public String getDoctorStatus() {
        return doctorStatus;
    }
    public String getDoctorRoomNum() {
        return doctorRoomNum;
    }
    void delete(AbstractList list , int num){
        if (list.size() == 0){
            System.out.println("enter no address is found in address book");
        }
        list.remove(num-1);
        System.out.println("Deleted successfully");
    }
}

class JavaProject   {
    public static void main(String[] args) {
        Doctor obj1 = new Doctor("doctorName", "doctorSpeciality", "doctorID", "doctorMobNum", "Yes","0");
        ArrayList<Doctor> list = new ArrayList<Doctor>();
        
        Scanner sc = new Scanner(System.in);
        JavaProject obj = new JavaProject();
        while (1>0){
            
            System.out.println("         Hospital Management System");
            System.out.println("         =================");
            System.out.println("  -->Enter \"1\" to Add Details ");
            System.out.println("  -->Enter \"2\" to count number of entries");
            System.out.println("  -->Enter \"3\" to display all the entries ");
            System.out.println("  -->Enter \"4\" to exit");
            System.out.println("\n");
            System.out.print("Please enter your choice: ");
            int choice = sc.nextInt();
            while ((choice != 1) && (choice != 2) && (choice != 3) && (choice !=4) && (choice !=5)) {
                System.out.println("Invalid choice!  Please select Add, Count, display, Exit: ");
                choice = sc.nextInt();
            }   
            if (choice  == 1) {      
                System.out.println("To add details follow the prompts.");

                System.out.print("Enter Name of Doctor: ");
                sc.next();
                obj1.setName(sc.nextLine());

                System.out.print("Enter doctor speciality: ");
                obj1.setSpeciality(sc.nextLine());

                System.out.print("Enter doctor ID: ");
                obj1.setDoctorID(sc.nextLine());

                System.out.print("Enter doctor mobile number: ");
                obj1.setDoctorMobNum(sc.nextLine());

                System.out.println("Enter doctor status: ");
                obj1.setDoctorStatus(sc.nextLine());

                System.out.println("Enter doctor Room number: ");
                obj1.setDoctorRoomNum(sc.nextLine());

                list.add(new Doctor(obj1.getDoctorName(), obj1.getDoctorspeciality(), obj1.getDoctorID(), 
                            obj1.getDoctorMobNum() , obj1.getDoctorStatus() , obj1.getDoctorRoomNum()));
                System.out.println("\nYou have successfully added a new entry!");
                System.out.println("\n");
                
                
                try {
                    FileOutputStream fos = new FileOutputStream("hospital.dat");
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(list);
                    oos.close();
                }

                catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
            }

            if (choice == 2){
                System.out.print("Total number of entries are -: ");
                System.out.println(list.size());
                System.out.println("\n");  
            }

            if (choice == 3){
                ArrayList<Doctor> list2=null;
                try {
                    FileInputStream is = new FileInputStream("hospital.dat");
                    ObjectInputStream ois = new ObjectInputStream(is);
                    list2 = (ArrayList<Doctor>) ois.readObject();
                    System.out.println("details are");
                    for (Doctor a:list2) {
                        System.out.println(a);
                    }
                    ois.close();
                    is.close();
                }
                catch(IOException| ClassNotFoundException e) {
                    System.out.println("Error");
                    e.printStackTrace();
                }
                
                System.out.println("\n");
            }
            
            if (choice == 4) {
                System.out.println("enter which entry you want to delete");
                int f = sc.nextInt();
                obj1.delete(list,f);
                System.out.println("\n");
                try {
                    FileOutputStream fos = new FileOutputStream("hospital.dat");
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(list);
                    oos.close();
                }

                catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }

                
            }
            if (choice ==5) {
                System.exit(0);
            }
        }
    }
}
    





