package package_demo;

class privatedemo
{
	private int no = 20;

	private void printdetails()
		{
			System.out.println("Printing details from the private method.");
		}


	public static void main(String args[])
	{
		privatedemo p1 = new privatedemo();
		System.out.println("number is: "+p1.no);
		p1.printdetails();
	}
}