import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class ArrayListClass {
    public static void main(String args[])
    {
        ArrayList<Integer> num = new ArrayList<Integer>();

        num.add(2);
        num.add(4);
        num.add(6);
        num.add(8);
        while(true){
        System.out.println("choose 1 for add, 2 for delete, 3 for update, 4 show all elements,5 exit");
        Scanner sc=new Scanner(System.in);
        int no= sc.nextInt();
            switch (no) {
                case 1:
                    System.out.println("now enter the element which you want to add");
                    int n = sc.nextInt();
                    num.add(n);
                    break;
                case 2:
                    System.out.println("which element you want to remove");
                    int d = sc.nextInt();
                    num.remove(d);
                    break;
                case 3:
                    System.out.println("enter the location on which you want to update");
                    int l = sc.nextInt();
                    System.out.println("enter element");
                    int ele = sc.nextInt();
                    num.set(l, ele);
                    break;
                case 4:
                    System.out.println(num);
                case 5:
                    System.exit(0);
                default:
                    System.out.println("choose correctly");
            }
        }
    }
}
