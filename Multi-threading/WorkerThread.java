

public class WorkerThread implements Runnable{
    private String massage;
    public WorkerThread(String s)
    {
        this.massage=s;
    }

    public void run()
    {
        System.out.println(Thread.currentThread().getName()+" (Start) massage: "+massage);
        processmassage();
        System.out.println(Thread.currentThread().getName()+" (End)");
    }

    private void processmassage()
    {
        try
        {
            Thread.sleep(2000);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

}
