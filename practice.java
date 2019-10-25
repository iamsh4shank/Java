

class Stu 
{
    String name;
    String rno;
    String branch;

    void input(String name , String rno , String branch)
    {
        this.name = name;
        this.rno = rno;
        this.branch = branch;
    }
    
    void display()
    {
        System.out.println("Name is - "+ name);
        System.out.println("roll number is - "+ rno);
        System.out.println("branch is - "+ branch);
    }
}

class practice
{
    public static void main(String[] args) {
        
    
    Stu l1 = new Stu();
    Stu l2 = new Stu();
    l1.input("Shashank" , "19060" , "AIE");
    l2.input("Prakhar" , "19061" , "ECE");

    l1.display();
    l2.display();
    
    }
}