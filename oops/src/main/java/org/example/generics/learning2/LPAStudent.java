package org.example.generics.learning2;

public class LPAStudent extends Student {
    private double percentCompleted;

    public LPAStudent() {
        this.percentCompleted = random.nextDouble(0, 100.001);
    }

    public double getPercentCompleted() {
        return percentCompleted;
    }

    @Override
    public String toString() {
        return "%s %8.1f%%".formatted(super.toString(), percentCompleted);
    }
}
