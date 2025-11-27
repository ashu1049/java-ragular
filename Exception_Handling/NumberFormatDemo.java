public class NumberFormatDemo {
    public static void main(String[] args) {
        
        String s="Ashutosh";
        System.out.println("Welcome to exception handling.");
        try{
            int no=Integer.parseInt(s);
            System.out.println(no);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Rest of my code.");
    }
}
