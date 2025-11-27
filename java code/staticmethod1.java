public class staticmethod1 {

    int emp_id;
    String name;
    static String company_name="FCT";
    

    staticmethod1(int emp_id,String name)
    {
        this.emp_id=emp_id;
        this.name=name;
    }
    //-we can only (change, modify, delete) the static data in static methods.
    static void change()
    {
        company_name="fcts";
        //emp_id=10; --- this is not valid cause emp_id is nit static data.
    }
    
    void show()
    {
        //company_name="FCTB";
        System.out.println("EMP ID:"+ emp_id + ", EMP NAME:"+ name + ", COMPANY NAME:"+ company_name);
    }

    public static void main (String args[])
    {
       staticmethod1 e1=new staticmethod1(101," Ashu");
       staticmethod1 e2=new staticmethod1(102," Vaishnav");
       change();

        e1.show();
        e2.show();
    }

}
