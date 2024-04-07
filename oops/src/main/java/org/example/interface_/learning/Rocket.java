package org.example.interface_.learning;

public record Rocket(String name) implements FlightEnabled, Trackable {
    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void track() {

    }
}
