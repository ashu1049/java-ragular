interface myinterface{

    default void display(){
        System.out.println("This is a default method in interface.");
     }
    
     default void show(){
        printdetails();
        System.out.println("use to show data.");
     }
    private void printdetails()
    {
        System.out.println("This is a private method in interface.");
    }
}

class privateinterface implements myinterface
{
    
}

class interface3private{
    public static void main(String args[])
    {
        privateinterface p1=new privateinterface();
        p1.display();
        p1.show();
    }
}