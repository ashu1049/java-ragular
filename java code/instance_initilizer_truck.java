public class instance_initilizer_truck 
{
    int speed;

    public instance_initilizer_truck()
    {
        System.out.println("speed of truck is : "+ speed);

        System.out.println("constructor executed.");
    }
    {

        speed= 50;
        System.out.println("Instance initailizer executed.");
    }

    public static void main(String args[])
    {
        instance_initilizer_truck t1 = new instance_initilizer_truck(); 
        instance_initilizer_truck t2 = new instance_initilizer_truck(); 

    }
}
