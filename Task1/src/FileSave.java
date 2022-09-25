import java.io.*;
import java.io.IOException;

public class FileSave{

    String file;

    public FileSave(String f){
        file = f;
    }

    public void Save(String line) throws IOException{
        FileWriter myWriter = new FileWriter("textFile.txt");
        myWriter.write(line);
        myWriter.close();
    }
}
