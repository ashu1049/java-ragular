class Print_Details{

    public static synchronized void print_message(String s) {
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Good night...");
            System.out.println(s);

            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        
    }
}

class MyThread1 extends Thread {
    Print_Details d;
    String s;

    MyThread1(Print_Details d,String s) {
        this.d=d;
        this.s=s;
    }

    public void run() {
        
    }
}



public class TestPrint {
    public static void main(String args[]) {
        Print_Details obj1 = new Print_Details();
        Print_Details obj2 = new Print_Details();

        MyThread1 t1 = new MyThread1(obj1,"Yash");
        MyThread1 t2 = new MyThread1(obj2,"Rahul");

        t1.start();
        t2.start();
    }
}