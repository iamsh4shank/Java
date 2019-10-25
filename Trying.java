class Super_class
{
    String name;
    public void nameIn(String name)
    {
        this.name = name;
    }
    public void nameOut()
    {
        System.out.println("Name is- "+name);
    }
}

class Sub_class extends Super_class
{
    String dept;
    public void deptIn(String dept , String name)
    {
        this.dept = dept;
        super.nameIn(name);
    }
    public void deptOut()
    {
        System.out.println("dept is- "+dept);
        super.nameOut();
    }

}

class Trying
{
    public static void main(String[] args)
    {
        Sub_class in = new Sub_class();
        in.deptIn("AIE" , "Shashank");
        in.deptOut();
    }
}