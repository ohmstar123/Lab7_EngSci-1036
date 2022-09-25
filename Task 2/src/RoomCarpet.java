public class RoomCarpet {

    //Variables
    private RoomDimension size;
    private double carpetCost;

    //Constructor
    public RoomCarpet(RoomDimension dim, double cost){
        size = dim;
        carpetCost = cost;
    }

    //getTotalCost method which multiplies the total area by carpet cost
    public double getTotalCost(){
        return(size.getArea() * carpetCost);
    }

    //toString method that displays the total cost of the carpet
    public String toString(){
        return("Carpet Cost: $" + getTotalCost());
    }
}
