
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateClass {
    public static void main(String args[])
    {
        LocalDateTime obj1 = LocalDateTime.now();
        System.out.println("date before formatting:"+obj1);
        DateTimeFormatter newobj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String abc=obj1.format(newobj);
        System.out.println("date after formatting:"+abc);
    }
}
