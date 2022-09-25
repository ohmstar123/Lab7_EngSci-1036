import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileDisplay {

    //Declare Variables
    String textFile;

    //Constructor
    public FileDisplay(String f){
        textFile = f;
    }

    //Display method that displays all text in file
    public void Display() throws IOException{
        File file = new File(textFile);
        Scanner inputFile = new Scanner(file);

        if (file.exists()){
            while(inputFile.hasNext())
                System.out.println(inputFile.nextLine());

        }
        else{
            System.out.println("The File does not exist");
            System.exit(0);
        }
    }

    //Display method that displays n number of lines in the text
    public void Display(int n)throws IOException{
        int counter = 0;

        File file = new File(textFile);
        Scanner inputFile = new Scanner(file);

        if (file.exists()){
            while(inputFile.hasNext()){
                if (counter < n){
                    System.out.println(inputFile.nextLine());
                }
                else{
                    break;
                }
                counter ++;
            }
        }
        else{
            System.out.println("The File does not exist");
            System.exit(0);
        }
    }

    //Display method that displays lines from a start and an end point
    public void Display(int from, int to)throws IOException{
        int counter = 1;

        File file = new File(textFile);
        Scanner inputFile = new Scanner(file);

        if (file.exists()){

            while(inputFile.hasNext()){
                String temp = inputFile.nextLine();

                if (counter >= from && counter <= to){
                    System.out.println(temp);
                }
                counter ++;
            }
        }
        else{
            System.out.println("The File does not exist");
            System.exit(0);
        }
    }
}
