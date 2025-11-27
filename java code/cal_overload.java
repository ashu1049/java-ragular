public class cal_overload {
    
    void area(double r)
    {
        double area= 3.14*r*r;
        System.out.println("Area of circle is :"+area);

    }
    void area(int s)
    {
        int area= s*s;
        System.out.println("Area of square is :"+area);

    }
    void area(int l,int b)
    {
        int area= l*b;
        System.out.println("Area of rectangle is :"+area);

    }

    public static void main(String[] args)
    {
        cal_overload c1= new cal_overload();
        c1.area(6.00); //circle
        c1.area(10); //square
        c1.area(10,20);//rectangle

        
    }
}
