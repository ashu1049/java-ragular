import package1.student1;

class teststudent
{
	public static void main(String args[])
	{
		student1 s1 = new student1();

		s1.setid(101);
		s1.setname("Ashutosh");
		s1.setcity("Nanded");

		System.out.println("ID: "+s1.getid()+", Name: "+s1.getname()+", City:  "+s1.getcity());	
	}


}