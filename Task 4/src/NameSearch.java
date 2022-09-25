import java.io.IOException;
import java.util.Scanner;

public class NameSearch {
    public static void main(String[] args) throws IOException {
        //Declare scanner
        Scanner scanner = new Scanner(System.in);

        //declare two instances from the class KidsPopularName
        KidsPopularName boyNames = new KidsPopularName("BoyNames.txt");
        KidsPopularName girlNames = new KidsPopularName("GirlNames.txt");

        //Ask user for a kid's name
        System.out.println("Enter a kids name");
        String childName = scanner.nextLine();


        //Check if the user inputted name is in either of the two instances
        if (boyNames.isPopularName(childName)){
            System.out.println("That is a popular boy name");
        }
        else if (girlNames.isPopularName(childName)){
            System.out.println("That is a popular girl name");
        }
        else{
            System.out.println("That name is not a popular name");
        }

    }
}
