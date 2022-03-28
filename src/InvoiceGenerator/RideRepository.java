package InvoiceGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RideRepository {

    Map<String, ArrayList<Ride>> userRides;
    public RideRepository() {
        userRides = new HashMap<>();
    }

    public void addRide(String userId, Ride[] rides) {
        this.userRides.computeIfAbsent(userId, k -> new ArrayList<>(Arrays.asList(rides)));
    }

    public Ride[] getRide(String userId) {
        return this.userRides.get(userId).toArray(new Ride[0]);
    }

}
