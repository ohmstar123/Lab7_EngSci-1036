import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class KidsPopularName {

    //Declare variables
    private String[] kidsNames;
    private String fileName;

    //Constructor
    public KidsPopularName(String fN)throws IOException{
        fileName = fN;
        kidsNames = new String[getNumNames()];
        fillNames();
    }

    //method to return the length of the file
    private int getNumNames()throws IOException {
        int counter = 0;
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        while(scanner.hasNext()){
            String current = scanner.nextLine();
            counter++;
        }

        return counter;
    }

    //method to fill array with names from file
    private void fillNames()throws IOException{
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()){
            for (int i = 0; i < getNumNames(); i++) {
                kidsNames[i] = scanner.nextLine();
            }
        }
    }

    //Method to check if the user inputted name is a name in the array
    public boolean isPopularName(String name)throws IOException{
        for (int i = 0; i < getNumNames(); i++) {
            if (kidsNames[i].equalsIgnoreCase(name))
                return true;
        }
        return false;
    }
}
