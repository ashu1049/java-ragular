abstract class inner{
    abstract void run();
}

public class Anonymous {
    public static void main(String[] args) {
        inner in =new inner()
        {
            void run()
            {
                System.out.println("Anonymous class.");
            }
        };

        in.run();
    }
}
