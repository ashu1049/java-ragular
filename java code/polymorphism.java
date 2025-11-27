class polymorphism 
{
    void display()
    {
        System.out.println("Display method executed.");
    }
    void display(int a)
    {
        System.out.println("Display method executed. "+a);
    }
    void display(String n)
    {
        System.out.println("Display method executed. "+n);
    }

    public static void main(String[] args)
    {
        polymorphism p1 = new polymorphism();
        p1.display();
        p1.display(10);
        p1.display("Ashutosh");
        
    }
}
