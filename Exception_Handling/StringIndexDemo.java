public class StringIndexDemo {
    public static void main(String[] args) {
        
        String s ="ashutosh";
        System.out.println("Welcome to exception handling.");
        try{
            System.out.println(s.charAt(10));
        }
        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        System.out.println("Rest of my code.");
    }
}