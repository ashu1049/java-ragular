class vehicle
{
    int chesisno;
    String vehicle_type;
    
    vehicle(int chesisno,String vehicle_type)
    {
        this.chesisno=chesisno;
        this.vehicle_type= vehicle_type;
    }
}

class super_bike extends vehicle
{
    String color;

    super_bike(int chesisno ,String vehicle_type ,String color)
    {
        super(chesisno, vehicle_type);
        this.color=color;
    }

    void show ()
    {
        System.out.println("Chesis NO.:"+ chesisno);
        System.out.println("Vehicle Type:"+ vehicle_type);
        System.out.println("color :"+ color);
    }

    public static void main(String[] args) 
    {
        super_bike s1 = new super_bike(1001, "two-wheeler", "Red");
        s1.show();
    }
    
}
