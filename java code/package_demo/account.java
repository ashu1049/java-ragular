package package_demo;

public class account
{
	private float balance;

	public float balance()
	{
		return balance;
	}

	public float depositbalance(float amount)
	{
		if(amount>0)
		{
			balance=balance+amount;
			
		}
		return balance;
	}

	

	public float widrawnbalance(float amount)
	{
		if(balance>amount &&  amount>0)
		{
			balance=balance-amount;
			
		}
		return balance;

	}

	

}