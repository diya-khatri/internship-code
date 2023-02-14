import java.util.Scanner;
import java.util.HashMap;
public class HashMapClass {
    public static void main(String args[]){
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        hm.put(1,"Diya");
        hm.put(2,"Richa");
        hm.put(3,"Dolly");
        while(true) {
            System.out.println("enter choice: 1 for add, 2 for delete, 3 to show all data, 4 to exit");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.println("enter the key");
                    int k = sc.nextInt();
                    System.out.println("enter the value");
                    Scanner sc1=new Scanner(System.in);
                    String s = sc1.nextLine();
                    hm.put(k, s);
                    break;
                case 2:
                    System.out.println("enter the key which you want to remove");
                    int ky = sc.nextInt();
                    hm.remove(ky);
                    break;
                case 3:
                    System.out.println(hm);
                    break;
                case 4:
                    System.exit(0);

                default:
                    System.out.println("choose correctly");
            }
        }
    }
}
