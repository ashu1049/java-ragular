
class table {
    
    synchronized void print_table(int n)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(n*i);

            try
            {
                Thread.sleep(500);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}

class MyThread1 extends Thread
{
    table t;

    MyThread1(table t)
    {
        this.t=t;
    }

    public void run()
    {
        t.print_table(5);
    }
}
class MyThread2 extends Thread
{
    table t;

    MyThread2(table t)
    {
        this.t=t;
    }

    public void run()
    {
        t.print_table(8);
    }
}

public class TestTable_Synchronization
{
    public static void main(String args[])
    {
        table obj= new table();

        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);

        t1.start();
        t2.start();
    }
}
