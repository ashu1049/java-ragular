class Ashutosh_exception extends Exception
{
    public Ashutosh_exception(String str)
    {
        super(str);
    }
}

public class custom_exception {
    public static void main(String args[])
    {
        try{
            throw new Ashutosh_exception ("this is my custom exception.");
        }
        catch(Ashutosh_exception e)
        {
            System.out.println(e);
        }

        System.out.println("Rest of my code.");

    }
}
