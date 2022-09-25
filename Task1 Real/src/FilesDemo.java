import java.io.IOException;

public class FilesDemo {
    public static void main(String[] args) throws IOException {
        //Instance for the class FileSave
        FileSave fs = new FileSave("lines.txt");

        //Save the following text into the FileSave instance
        fs.Save("1-Lorem ipsum dolor sit amet\n" +
                "2-Consectetuer adipiscing elit\n" +
                "3-Sed diam nonummy nibh euismod tincidunt\n" +
                "4-Ut wisi enim ad minim veniam\n" +
                "5-Quis nostrud exerci tation ullamcorper\n" +
                "6-Suscipit lobortis nisl ut aliquip ex ea commodo consequat\n" +
                "7-Duis autem vel eum iriure dolor in hendrerit\n" +
                "8-Vel illum dolore eu feugiat nulla facilisis at vero eros");

        //Instance for the class FileDisplay
        FileDisplay fd = new FileDisplay("lines.txt");

        //Display the lines in the text
        fd.Display();

        //Display the first 3 lines
        fd.Display(3);

        //Display the first 10 lines - in this case first 8 since there are only 8 lines
        fd.Display(10);

        //Display lines from line 3 to line 5
        fd.Display(3,5);
    }
}
