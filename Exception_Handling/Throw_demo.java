public class Throw_demo {

    public static void validate(int age)
    {
        if (age < 18)
        {
            throw new ArithmeticException("person is not Allowed to vote.");
        }
        else
        {
            System.out.println("Person is allowed to vote.");
        }
    }
    public static void main(String args[])
    {
        try{
            validate(16);
        }
        catch(Exception e)
                {
            System.out.println(e);
        }

        System.out.println("rest of my code.");
    }
}
