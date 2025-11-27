

public class nestedifdemo {
    public static void main(String args[])

{
    int age=21;
    int wt=60 ;

    if(age>18)
    {
        if(wt>50)
        {
            System.out.println("you are eligible for blood donation.");
        }
       else
        {
            System.out.println("you are not eligible for blood donation.");
        }
    }

    else
        {
            System.out.println("you are not eligible for blood donation.");
        }   
}
}
