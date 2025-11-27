class vehicle
{
    public void run()
    {
        System.out.println("Hello from the parent class method.");
    }
}
class bike extends vehicle
{
    public void run()
    {
        System.out.println("Hello from the child class method.");
    }
}
class overridedemo1
{
    public static void main(String[] args) 
    {
        bike b1 = new bike();
        b1.run();
    }
}

