import java.util.Scanner;

public class Scannner_class {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String name= sc.nextLine();

        System.out.println("Your name is: "+name);
        sc.close();
    }
}
