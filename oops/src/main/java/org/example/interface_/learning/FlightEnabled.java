package org.example.interface_.learning;

abstract interface FlightEnabled {
    double MILES_TO_KM = 1.60934;
    public static final double KM_TO_MILES= 0.621371;

    void takeOff();

    abstract void land();

    default int nextGear() {
        System.out.println(getClass().getName() + " has not implemented it yet!");
        return 0;
    }

    default int currentSpeed() {
        return 100;
    }
}
