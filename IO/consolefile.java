import java.io.Console;

public class consolefile {
    public static void main(String[] args) {
        Console c=System.console();
        System.out.print("Enter your name: ");
        String name= c.readLine();

        System.out.print("Enter your Password: ");
        char[] ch=c.readPassword();
        String pass=String.valueOf(ch);

        System.out.println("Welcome "+name);
        System.out.println("Your Password is: "+pass);
    }
}
