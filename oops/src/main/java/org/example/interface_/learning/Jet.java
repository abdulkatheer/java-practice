package org.example.interface_.learning;

public class Jet implements FlightEnabled, Trackable {
    private int currentGear = 0;

    @Override
    public void takeOff() {
        System.out.println(this.getClass().getSimpleName() + " is taking off");
        currentGear += 2;
    }

    @Override
    public void land() {
        System.out.println(this.getClass().getSimpleName() + " is landing");
    }

    @Override
    public void track() {
        System.out.println(this.getClass().getSimpleName() + "'s coordinates recorded");
    }

    @Override
    public int nextGear() {
        System.out.println(getClass().getName() + "'s implementation");
        System.out.println("speed=" + FlightEnabled.super.currentSpeed());
        return currentGear + 1;
    }
}
