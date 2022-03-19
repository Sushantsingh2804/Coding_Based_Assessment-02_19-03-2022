import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Vowels_Count {
    public static void main(String[] args) {
        try {
            int count_a=0,count_e=0,count_i=0,count_o=0,count_u=0,count_c=0;
            File myFile = new File("Data.txt");
            Scanner myReader = new Scanner(myFile);
            String data = null;
            while (myReader.hasNextLine()) {
                data = myReader.nextLine();
            }
            for (int i=0;i<data.length();i++){
                if((data.charAt(i) == 'a') || (data.charAt(i) == 'A')){
                    count_a++;
                }
                else  if((data.charAt(i) == 'e') || (data.charAt(i) == 'E')){
                    count_e++;
                }
                else  if((data.charAt(i) == 'i') || (data.charAt(i) == 'I')){
                    count_i++;
                }
                else if((data.charAt(i) == 'o') || (data.charAt(i) == 'O')){
                    count_o++;
                }
                else  if((data.charAt(i) == 'u') || (data.charAt(i) == 'U')){
                    count_u++;
                }
                else {
                    count_c++;
                }
            }
            System.out.println("File data= "+data);
            System.out.println("Character\t  Count");
            System.out.println("A: \t\t\t\t"+count_a);
            System.out.println("E: \t\t\t\t"+count_e);
            System.out.println("I: \t\t\t\t"+count_i);
            System.out.println("O: \t\t\t\t"+count_o);
            System.out.println("U: \t\t\t\t"+count_u);
            System.out.println("Consonants:\t   "+count_c);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
