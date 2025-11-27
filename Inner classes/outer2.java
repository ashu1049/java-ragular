//Static nested class
public class outer2 {

    static int n=50;

    static class inner{
        
        void show()
        {
            System.out.println("Value of n: "+n);
        }
    }

    public static void main(String[] args) {
        
        outer2.inner obj1= new outer2.inner();
        obj1.show();
    }
    
}
