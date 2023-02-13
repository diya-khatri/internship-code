
class A
{
    int x=10;
    class B
    {
        int y=5;
    }
}
public class InnerClass {
    public static void main(String args[])
    {
        A a=new A();
        A.B b=a.new B();
        System.out.println(a.x+b.y);

    }
}
