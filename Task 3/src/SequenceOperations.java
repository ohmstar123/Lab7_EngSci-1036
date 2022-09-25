import java.util.Arrays;

public class SequenceOperations {

//Static double method to find the total sum of the array
    public static double getTotal(double[] t){
        double sum = 0;

        for (int i = 0; i < t.length; i++) {
            sum += t[i];
        }

        return sum;
    }

    //Static double method to find the average of the array
    public static double getAverage(double[] a){
        return getTotal(a)/a.length;
    }

    //Static double method to find the highest number in the array
    public static double getHighest(double[] h){
        double highest = 0;

        for (int i = 0; i < h.length; i++) {
            if (highest < h[i])
                highest = h[i];
        }

        return highest;
    }

    //Static double method to get the reverse order of the array
    public static double[] getReverse(double[] r){
        double[] temp = new double[r.length];
        int counter = 0;

        for (int i = r.length - 1; i >= 0; i--) {
            temp[counter] = r[i];
            counter++;
        }

        return temp;
    }
}
