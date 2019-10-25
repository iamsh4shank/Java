class Info 
{
    int Pno;
    String Category;
    String Exhibit;
    
    void fixExhibit(String category) 
    {
        if(Category == "Antique")
        {
            Exhibit = "Zaveri";
        }
        if(Category == "Modern")
        {
            Exhibit = "Johnson";
        }
        if(Category == "Classic")
        {
            Exhibit = "Terendia";
        }
    }

    void registor(int pno , String category)
    {
        Pno = pno;
        Category = category;
        fixExhibit(category);
    }

    void viewAll()
    {
        System.out.println(Pno);
        System.out.println(Category);
        System.out.println(Exhibit);
        
    }
}

class Photo
{
    public static void main(String[] args)
    {
        Info info1 = new Info();
        Info info2 = new Info();
        info1.registor(1, "Classic");
        info2.registor(2,"Modern");

        info1.viewAll();
        info2.viewAll();
                
    }
}
