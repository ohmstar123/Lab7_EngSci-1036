import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileSave {

    //Declare variables
    String textFile;

    //Constructor
    public FileSave(String f){
        textFile = f;
    }

    //Save method that saves line into file
    public void Save(String line) throws IOException {
        FileWriter fw = new FileWriter(textFile, true);
        PrintWriter pw = new PrintWriter(fw);
        pw.println(line);
        pw.close();
    }
}
