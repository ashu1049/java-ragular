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

class jrprogrammer extends programmer
{
    int bonus= 10000;
    String name="ashutosh";
    String skill="java";
}

class multilevel_inheritance
{
    public static void main(String[] args) 
    {
        jrprogrammer p1= new jrprogrammer();
        System.out.println("Name: "+p1.name+", salary: "+p1.salary+", Bonus: "+p1.bonus+", company name: "+p1.company_name+", Skill: "+p1.skill);
    }
}
