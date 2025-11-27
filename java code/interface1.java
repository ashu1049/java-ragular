interface shape
{
    void draw();
    void show();
    default void run(){System.out.println("executing default method in interface.");}
}

class circle implements shape
{
    public void draw()
    {
        System.out.println("Drawing circle.");
    }

    public void show()
    {
        System.out.println("showing circle.");
    }
}

public class interface1 {
    public static void main(String[] args) {
        
        shape s1 = new circle();
        s1.draw();
        s1.show();
        s1.run();
    }

}
