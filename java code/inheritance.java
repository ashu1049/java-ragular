class employee 
{
    int salary = 40000;
    String company_name="FCT";
}

class programmer extends employee
{
    int bonus= 10000;
    String name="ashutosh";

}

class inheritance
{
    public static void main(String[] args) 
    {
        programmer p1= new programmer();
        System.out.println("Name: "+p1.name+", salary: "+p1.salary+", Bonus: "+p1.bonus+", company name: "+p1.company_name);
    }
}
//bonus and name are the properties of programmer and salary and company name is inherited from the employee.