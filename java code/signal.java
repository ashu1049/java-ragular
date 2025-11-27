//Signal if red stop, if yellow ready, If green go


public class signal {
    public static void main (String args[])
    {
        String colour = "Yellow" ;

        if (colour=="Red")
        {
            System.out.println("You should Stop!!");
        }
        else if (colour=="Green")
        {
            System.out.println("You can go!!");
        }
        else if (colour=="Yellow")
        {
            System.out.println("Be ready to go!!");
        }
        else
        {
            System.out.println("Not a valid colour");
        }
    }
}
