class testcube{
    static int cube(int x)
    {
        return x*x*x;
    }

}

public class calculate1
{

public static void main(String args[])
    {
        
        int res=testcube.cube(5);
        System.out.println("cube of a number is: "+ res);
    }
}
