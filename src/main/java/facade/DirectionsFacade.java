package facade;

public class DirectionsFacade {
    private TrapostoPubblicoRouteFinder trapostoPubblicoRouteFinder = new TrapostoPubblicoRouteFinder();
    private APiediRouteFinder aPiediRouteFinder = new APiediRouteFinder();

    public String getAllDirections() {
        String publictransit = trapostoPubblicoRouteFinder.getDirections();
        String walking = aPiediRouteFinder.getDirections();
        return publictransit + " \n" + walking;

    }
}
