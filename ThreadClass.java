class ThreadClass1 extends Thread {
    public void run()
    {
        for(int i=0;i<100;i++) {
            System.out.println("this is thread1");
        }
    }
}
class ThreadClass2 extends Thread {
    public void run()
    {
        for(int i=0;i<100;i++) {
            System.out.println("this is thread2");
        }
    }
}
public class ThreadClass{
    public static void main(String args[]) {
        ThreadClass1 t1 = new ThreadClass1();

        ThreadClass2 t2 = new ThreadClass2();
        t1.start();
        t2.start();
    }
}