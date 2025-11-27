package package2;
import package1.protecteddemo;

class testprotected1 extends protecteddemo
{
		
	public static void main(String args[])
	{
		testprotected1 p1 = new testprotected1();
		System.out.println("number is: "+p1.no);
		
	}
}