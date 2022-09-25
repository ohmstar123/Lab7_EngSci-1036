public class RoomDimension {

    //Variables
    private double length;
    private double width;

    //Constructor
    public RoomDimension(double len, double w){
        length = len;
        width = w;
    }

    //getArea method which multiplies length and width
    public double getArea(){
        return(length * width);
    }

    //toString method that displays the length, width, and area
    public String toString(){
        return("Length: " + length + " Width: " + width + " Area: " + getArea());
    }
}
