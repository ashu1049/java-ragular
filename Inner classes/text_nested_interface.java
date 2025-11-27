interface A
{
    void show();

    interface B
    {
        void display();
    }
}
public class text_nested_interface implements A,A.B {
    
     public void show()
     {
        System.out.println("show method. of main interface.");
     }

     public void display()
     {
        System.out.println("display method. of main interface.");
     }

     public static void main(String[] args) {
        
        A obj1= new text_nested_interface();
        obj1.show();

        A.B obj2= new text_nested_interface();
        obj2.display();
     }
}
