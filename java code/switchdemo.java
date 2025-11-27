
public class switchdemo {
    public static void main(String args[])
    {
        System.out.println("1. cricket");
        System.out.println("2. football");
        System.out.println("3. rugby");
        System.out.println("4. polo");
        System.out.println("5. vollyball");

       
        int choice= 3;

        switch( choice )
        {
            case 1:
            System.out.println("my favourite game is cricket.");
            break;

            case 2:
            System.out.println("my favourite game is football.");
            break;

            case 3:
            System.out.println("my favourite game is rugby.");
            break;

            case 4:
            System.out.println("my favourite game is polo.");
            break;

            case 5:
            System.out.println("my favourite game is villyball.");
            break;

            default:
            System.out.println("invalid sport selected.");
            break;
        }
    }
}
