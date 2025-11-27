public class exception_demo1 {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        System.out.println("Welcome to wxception handling.");
        try{
            System.out.println(a/b);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("rest of my code.");
    }
}
