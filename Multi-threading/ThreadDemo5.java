public class ThreadDemo5 extends Thread {
    public void run()
    {
       
        System.out.println(Thread.currentThread().getName());
        }

    public static void main(String[] args) {
        
        ThreadDemo5 t1 = new ThreadDemo5();
        ThreadDemo5 t2 = new ThreadDemo5();
        ThreadDemo5 t3 = new ThreadDemo5();

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());

        t1.setPriority(8);
        t2.setPriority(5);
        t3.setPriority(9);

        t1.start();
        t2.start();
        t3.start();

        System.out.println(Thread.currentThread().getName());

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());


    }
}