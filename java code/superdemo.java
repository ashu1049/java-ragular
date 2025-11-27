class parent
{
    String massage = "Happy Diwali";
    void eat()
    {
        System.out.println("I'm eating sweets.");
    }
}
public class superdemo extends parent {

    String massage = "everyone";

    void eat()
    {
        super.eat();
        System.out.println("I like homemade sweets.");
    }

    void showmassage()
    {
        System.out.println(super.massage);
        System.err.println(massage);
        
    }
    public static void main(String args[])
    {
        superdemo d1 = new superdemo();
        d1.showmassage();
        d1.eat();
    }
}
