import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class FileDisplay {

    String file;

    public FileDisplay(String f){
        file = f;
    }

    public void Display(){
        File FileWriter = new File("textFile.txt");
        Scanner scanner = new Scanner(System.in);
        if (FileWriter.exists()){
            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        }
        else{
            System.out.println("The file does not exist");
            System.exit(0);
        }
    }

    public void Display(int n){
        File FileWriter = new File("textFile.txt");
        int counter = 0;

        if (FileWriter.exists()){
            System.out.println("The file does not exist");
        }
        else {
            System.exit(0);
        }

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){

            if (counter < n){
                System.out.println(scanner.nextLine());
            }
            counter++;
        }
    }

    public void Display(int from, int to){
        File FileWriter = new File("textFile.txt");
        int counter = 0;

        if (FileWriter.exists()){
            System.out.println("The file does not exist");
        }
        else {
            System.exit(0);
        }

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){

            if (counter > from && counter < to){
                System.out.println(scanner.nextLine());
            }
            counter++;
        }
    }
}
