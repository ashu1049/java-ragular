class customer{
    int amount=10000;
    synchronized void withdraw(int amount)
    {
        System.out.println("Going to withdraw...");

        if (this.amount < amount )
            {
                System.out.println("less balance, waiting for deposit.");
                try{
                    wait();
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            }
            this.amount-=amount;
            System.out.println("Withdrawal completed...");
    }

    synchronized void deposit(int amount)
    {
        System.out.println("Going to Deposit...");

        
        this.amount+=amount;
        System.out.println("deposited amount...");

        notify();
    }
}

class calculate
{
    public static void main(String[] args) {
        final customer c1 = new customer();

        new Thread(){
            public void run()
            {
                c1.withdraw(15000);
            }
        }.start();

        new Thread(){
            public void run()
            {
                c1.deposit(15000);
            }
        }.start();

    }
}