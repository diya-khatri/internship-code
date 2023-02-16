import java.io.FileWriter;
import java.io.IOException;
public class WriteToFile {
    public static void main(String args[]) {
        try  {
            FileWriter wr = new FileWriter("filename.txt");
            wr.write("this is file writing");
            wr.close();
            System.out.println("successfully written in file");
        } catch (IOException e) {
            System.out.println("an error occured");
        }
    }
}
