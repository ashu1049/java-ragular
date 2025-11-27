public class Thisdemo {

    int id;
    String name;
    double marks;

    public Thisdemo( int id,String name, double marks)
    {
        this.id= id;
        this.name=name;
        this.marks=marks;
    }

    public void display()
    {
        System.out.println("ID:"+id+" NAME:"+name+" MARKS:"+marks);
    }

    public static void main(String argd[])
    {
        Thisdemo s1= new Thisdemo(101, "ashu", 700);
        s1.display();

        Thisdemo s2= new Thisdemo(102, "vaishnav", 600);
        s2.display();
    }
    
}
