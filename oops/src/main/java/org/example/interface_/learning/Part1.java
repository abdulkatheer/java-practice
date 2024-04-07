package org.example.interface_.learning;

public class Part1 {
    public static void main(String[] args) {

        Bird b = new Bird();
        b.move();
        b.takeOff();
        b.track();
        b.land();

        Jet j = new Jet();

        inFlight(b);
        inFlight(j);

        Trackable bus = new Bus();
        bus.track();

        Satellite satellite = new Satellite();
        ((OrbitEarth) satellite).achieveOrbit();

        double kilometersTravelled = 100;
        System.out.printf("I've travelled %.2f KMs (%.2f miles)%n", kilometersTravelled, kilometersTravelled * FlightEnabled.KM_TO_MILES);
    }

    private static void inFlight(FlightEnabled f) {
        f.takeOff();
        if (f instanceof Trackable e) {
            e.track();
        }
        f.land();
        f.nextGear();
        System.out.println("-".repeat(30));
    }
}
