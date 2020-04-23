import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exceptions {
    public static void main(String[] args) throws FileNotFoundException {


        try {
            readfile();
        } catch (FileNotFoundException e) {
           System.out.println("Handling Exception in Main method");
        }


    }
    public static void readfile() throws FileNotFoundException {
        File file = new File("abc.txt");
        FileReader fileReader = new FileReader(file);

    }
}
