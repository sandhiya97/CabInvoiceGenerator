package InvoiceGenerator;

public class Ride{

    public int time;
    public double distance;
    public RideType rideType;

    public Ride(RideType rideType, double distance, int time) {
        this.distance = distance;
        this.time = time;
        this.rideType = rideType;
    }

    public double getDistance() {
        return distance;
    }

    public int getTime() {
        return time;
    }

}