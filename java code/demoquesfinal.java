final class pivalue
{
    final double  pi= 3.14;
}

class calculate 
{
    pivalue p1 = new pivalue();
    void area(int r)
    {
        double area= p1.pi*r*r;
        System.out.println("Area of circle is : "+ area);
    }
}

class demoquesfinal {
    public static void main(String[] args) 
    {
        calculate c1 = new calculate();
        c1.area(10);
    }
}
