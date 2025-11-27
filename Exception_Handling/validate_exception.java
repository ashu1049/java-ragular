class Invalid_age_exception extends Exception
{
    public Invalid_age_exception(String str)
    {
        super(str);
    }
}

public class validate_exception {
    
    public static void validate(int age) throws Invalid_age_exception
    {
        if (age < 18)
        {
            throw new Invalid_age_exception("this person is not allowed to vote.");
        }
        else
        {
            System.out.println("This person is allowed to vote.");
        }
    }

    public static void main(String[] args) {

        System.out.println("Start.");
        
        try
        {
            validate(19);
        }
        catch(Invalid_age_exception e)
        {
            System.out.println(e);
        }

        System.out.println("end.");
    }
}
