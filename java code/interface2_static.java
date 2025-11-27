interface drawable
{
    void draw();

    static int cube(int x)
    {
        return x*x*x;
    }

    default void display()
    {
        System.out.println("Default method");
    }
} 

class rectangle implements drawable{
    public void draw()
    {
        System.out.println("Drawing rectangle");
    }
}


public class interface2_static 
{
    public static void main(String[] args) {
        drawable d1 = new rectangle();
        d1.draw();
        System.out.println(drawable.cube(10));
        d1.display();
    }
    
}
