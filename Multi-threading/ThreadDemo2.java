public class ThreadDemo2 implements Runnable{
    public void run()
    {
        System.out.println("Thread is running.");
    }

    public static void main(String[] args) {
        
        ThreadDemo2 t1 = new ThreadDemo2();

        Thread t2 = new Thread(t1);
        t2.start();
    }
}

