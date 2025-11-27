
abstract class bike{
    abstract void run();
    abstract void show();

    void display()
    {
        System.out.println("non abstract method in abstract class.");
    }
}

class bajaj extends bike
{
    void run()
    {
        System.out.println("Bike is runnig.");
    }
    
    void show(){}
}


public class abstraction1 {
    public static void main(String[] args) 
    {
        bajaj b1 = new bajaj();
        b1.run();
        b1.display();    
    }
}
