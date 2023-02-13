interface A1
{
   public void func1();
}
interface  B1
{
    public void func2();
}
class Democlass implements A1,B1 {
    public void func1()
    {
        System.out.println("this is first interface's function");
    }

    @Override
    public void func2() {
        System.out.println("this is second interface's function");
    }
}
public class InterfaceClass {
 public  static void main(String args[])
 {
     Democlass d=new Democlass();
     d.func1();
     d.func2();
 }
}

