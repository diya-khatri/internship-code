public class StaticClass {

    static void func1()
    {
        System.out.println("call function without creating object");
    }
    public void func2()
    {
        System.out.println("must have to create object for calling");
    }
    public static void main(String args[])
    {
        func1();
        StaticClass s=new StaticClass();
        s.func2();
    }
}
