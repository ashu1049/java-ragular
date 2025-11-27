class Outer
{
    void display()
    {
        System.out.println("outer class method");
    }

    class Inner
    {
        void show()
        {
            System.out.println("this is inner class method.");
        }
    }

    public static void main(String[] args) {
        
        Outer o = new Outer();
        
        Outer.Inner in= o.new Inner();

        in.show();
    }

}