package package1;

class atm
{
	public static void main(String args[])
	{
		account a1= new account();
		System.out.println(a1.balance());
		System.out.println("My current balance is: "+a1.depositbalance(10000));
		System.out.println(a1.widrawnbalance(5000));
	}
}