public class NullPointerDemo {
    public static void main(String[] args) {
        
        String s=null;
        System.out.println("Welcome to exception handling.");
        try{
            System.out.println(s.length());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Rest of my code.");
    }
}
