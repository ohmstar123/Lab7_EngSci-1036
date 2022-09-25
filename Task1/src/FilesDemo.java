import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class FilesDemo {
    public static void main(String[] args) throws IOException{

        FileSave sFile = new FileSave("lines.txt");
        FileDisplay dFile = new FileDisplay("lines.txt");

        sFile.Save("1-Lorem ipsum dolor sit amet\n" +
                "2-Consectetuer adipiscing elit\n" +
                "3-Sed diam nonummy nibh euismod tincidunt\n" +
                "4-Ut wisi enim ad minim veniam\n" +
                "5-Quis nostrud exerci tation ullamcorper\n" +
                "6-Suscipit lobortis nisl ut aliquip ex ea commodo consequat\n" +
                "7-Duis autem vel eum iriure dolor in hendrerit\n" +
                "8-Vel illum dolore eu feugiat nulla facilisis at vero eros");

        dFile.Display();
        dFile.Display(3);
        dFile.Display(3,5);

    }
}
