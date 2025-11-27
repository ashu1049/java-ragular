
//IN JAVA MULTIPLE INHERITANCE IS NOT SUPPORTED BUT WE CAN ACHIEVE IT USING INTERFACE.
interface A1 
{
    int id=100;
}

interface B1
{
    String name="ashutosh";
}
class  C1 implements A1,B1
{
    String color="white";
    public void display()
    {
        System.out.println("ID: "+id+", NAME: "+ name+", COLOR: "+color);
    }
}

