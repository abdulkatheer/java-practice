package org.example.interface_.learning;

public class Satellite implements FlightEnabled, Trackable, OrbitEarth {
    @Override
    public void achieveOrbit() {
        System.out.println(this.getClass().getSimpleName() + " achieved the orbit");
    }

    @Override
    public void takeOff() {
        System.out.println(this.getClass().getSimpleName() + " is taking off");
    }

    @Override
    public void land() {
        System.out.println(this.getClass().getSimpleName() + " is landing");
    }

    @Override
    public void track() {
        System.out.println(this.getClass().getSimpleName() + "'s coordinates recorded");
    }
}
