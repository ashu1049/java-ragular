interface inner{
    abstract void run();
}

public class Anonymous1 {
    public static void main(String[] args) {
        inner in =new inner()
        {
            public void run()
            {
                System.out.println("Anonymous class.");
            }
        };

        in.run();
    }
}
