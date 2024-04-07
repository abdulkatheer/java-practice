package org.example.interface_.learning;

import java.util.stream.StreamSupport;

public class Bird extends Animal implements FlightEnabled, Trackable {
    @Override
    protected void move() {
        System.out.println(this.getClass().getSimpleName() + " is moving");
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
