public class outer1 {
    void display()
    {
        System.out.println("This is outer class method.");

        class Local_inner
        {
            void show()
            {
                System.out.println("this is method of local inner class.");
            }
        }
            Local_inner li = new Local_inner();
            li.show();

    }

    public static void main(String[] args) {
        
        outer1 o= new outer1();
        o.display();
    }


}
