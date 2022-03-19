import java.io.FileWriter;
import java.io.IOException;

public class Write_file {
    public static void main(String[] args) {
        try {
            FileWriter write= new FileWriter("Data.txt");
            write.write("HAPPY NEW YEAR");
            write.close();
            System.out.println("File Creation Successful");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
