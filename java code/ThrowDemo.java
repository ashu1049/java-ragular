public class ThrowDemo {

    public static void validate(int age)
    {
        if (age < 18)
        {
            throw new Validate_Exception("person is not Allowed to vote.")
        }
        else
        {
            System.out.println("Person is allowed to vote");
        }
    }
    public static void main(String args[])
    {
        validate(16);
        System.out.println("rest of my code.");
    }
}
