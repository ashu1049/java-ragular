class products
{
    int pid;
    String pname;
    float pprice;

    products(int pid, String pname, float pprice)
    {
        this.pid=pid;
        this.pname=pname;
        this.pprice=pprice;
    }

    public void display()
    {
        System.out.println("Id: "+pid+ ", Name: "+pname+ ", Price: "+pprice);
        
    }

}

public class Array_object {
    public static void main(String[] args) 
    {
        products obj[]=new products[5];

        obj[0]= new products(101, "iphone", 150);
        obj[1]= new products(102, "iwatch", 100);
        obj[2]= new products(103, "oppo", 250);
        obj[3]= new products(104, "vivo", 180);
        obj[4]= new products(105, "samsung", 350);

        for(int i=0;i<5;i++)
        {
            obj[i].display();
        }
         
        obj[0].display();
        obj[1].display();
        obj[2].display();
        obj[3].display();
        obj[4].display();
    }
}
