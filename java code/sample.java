public class sample {

    int id;
    String name;

    public sample(int id, String name)
    {
        this.id=id;
        this.name=name;

    }
    void display(sample obj)
    {
        System.out.println("Display Method Executed");
        System.out.println("ID:"+id+" Name:"+name);
        
    }

    void show()
    {
        System.out.println("Show Method Executed");
        display(this);
    }

    void info()
    {
        System.out.println("Info Method Executed");
        display(this);
    }

public static void main(String args[])
{
    sample s1=new sample(101,"Ashu");
    s1.show();

    sample s2=new sample(102,"yash");
    s2.info();
}  

}
