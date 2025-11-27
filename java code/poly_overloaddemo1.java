class poly_overloaddemo1 

{
    void show()
    {
        System.out.println("Welcome to overloading.");
    }
    void show(String name)
    {
        System.out.println("Welcome to overloading."+name);
    }
    void show (int a)
    {
        System.out.println("Welcome to overloading."+a);
    }
    void show (String name,int a)
    {
        System.out.println("Welcome to overloading."+name+" "+a);
    }

    public static void main(String[] args) 
    {
        poly_overloaddemo1 p1= new poly_overloaddemo1();
        p1.show();
        p1.show("ASHUTOSH");
        p1.show(10);
        p1.show("VAISHNAV",20);
    }
}


