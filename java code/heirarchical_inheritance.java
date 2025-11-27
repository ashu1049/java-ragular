class employee 
{
    int salary = 40000;
    String company_name="FCT";
}

class programmer extends employee
{
    int bonus= 10000;
    String name="ashutosh";
    String skill="java";
}

class tester extends employee
{
    int bonus= 5000;
    String name="vaishnav";
    String skill="selenium";
}

class heirarchical_inheritance
{
    public static void main(String[] args) 
    {
        programmer p1= new programmer();
        System.out.println("Name: "+p1.name+", salary: "+p1.salary+", Bonus: "+p1.bonus+", company name: "+p1.company_name+", Skill: "+p1.skill);

        tester t1= new tester();
        System.out.println("Name: "+t1.name+", salary: "+t1.salary+", Bonus: "+t1.bonus+", company name: "+t1.company_name+", Skill: "+t1.skill);


    }
}
