class Address {
    String state, city, country;

    Address(String city,String state,String country)
    {
        this.city=city;
        this.state=state;
        this.country=country;
    }
}

class employee
    {
        int empid;
        String empname;
        Address eaddress;

        employee(int empid, String empname, Address eaddress)
        {
            this.empid=empid;
            this.empname=empname;
            this.eaddress=eaddress;
        }

        void display()
        {
            System.err.println(empid+ " "+ empname);
            System.err.println(eaddress.city+ " "+ eaddress.state+" "+eaddress.country);
        }
    }


    class aggregation
    {
        public static void main(String[] args) 
        {
            Address a1=new Address("pune", "maharashtra", "india");
            employee e1= new employee(101, "Ashutosh", a1);
            e1.display();
        }
    }

