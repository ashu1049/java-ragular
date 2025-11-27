abstract class bank
{
    abstract int getinterestrate();
}

class sbi extends bank
{
   int getinterestrate()
    {
        return 8;
    }
}
class hdfc extends bank
{
    int getinterestrate()
    {
        return 10;
    }
}

public class abstraction2_bankex {
    public static void main(String[] args) 
    {
        bank b1 = new sbi();
        System.out.println("Rate of intrest :"+ b1.getinterestrate()+" %");

        bank b2 = new hdfc();
        System.out.println("Rate of intrest :"+ b2.getinterestrate()+" %");
       
    }
}
