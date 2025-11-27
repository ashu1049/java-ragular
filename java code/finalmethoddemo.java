class A
{
    final void run()
    {
        //Parent class method with final keyword
        System.out.println("Run method from class A.");
        System.out.println("Can not return run method from class B cause final method cannot be overridden.");
    }
}
class B extends A
{
    // child class method for final method (Not possible) 
    /*void run()
    {
        System.out.println("Run method from class B.");
    }*/
}

public class finalmethoddemo {
    public static void main(String[] args) 
    {
        B b1 = new B();
        b1.run();
    }
}
