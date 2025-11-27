public class staticvar {

    int emp_id;
    String name;
    static String company_name="fct";
    
    // if we dont use constructor or this keyword then it will return default values if the emp_id and name 
    staticvar(int emp_id,String name)
    {
        this.emp_id=emp_id;
        this.name=name;
    }
    
    void show()
    {
        System.out.println("EMP ID:"+ emp_id + ", EMP NAME:"+ name + ", COMPANY NAME:"+ company_name);
    }

    public static void main (String args[])
    {
        staticvar e1=new staticvar(101," Ashu");
        staticvar e2=new staticvar(102," Vaishnav");

        e1.show();
        e2.show();
    }

}
