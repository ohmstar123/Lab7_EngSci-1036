import java.util.Arrays;

public class Task3Demo {
    public static void main(String[] args) {
        //Create the array
        double[] array = {3.0, 2.4, 6.0, 2.0, 4.0, 5.1, 7.2};

        //Print the array
        System.out.println("Processing the array: " + Arrays.toString(array));

        //Print the total of the each component of the array
        System.out.println("Total: " + SequenceOperations.getTotal(array));

        //Print the average of the array
        System.out.printf("Average: %.2f\n", SequenceOperations.getAverage(array));

        //Print the highest number in the array
        System.out.println("Highest value: " + SequenceOperations.getHighest(array));

        //Print the array in the reverse order
        System.out.println("Array Reverse: " + Arrays.toString(SequenceOperations.getReverse(array)));

    }
}
