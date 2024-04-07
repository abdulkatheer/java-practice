package org.example.generics.challenge1;

public class LPAStudent extends Student {
    private double percentCompleted;

    public LPAStudent() {
        this.percentCompleted = random.nextDouble(0, 100.001);
    }

    public double getPercentCompleted() {
        return percentCompleted;
    }

    @Override
    public boolean matchField(String fieldName, String fieldValue) {
        boolean result = super.matchField(fieldName, fieldValue);
        if (!result) {
            fieldName = fieldName.toUpperCase();
            result = switch (fieldName) {
                case "PERCENTCOMPLETED" -> percentCompleted <= Double.parseDouble(fieldValue);
                default -> false;
            };
        }
        return result;
    }

    @Override
    public String toString() {
        return "%s %8.1f%%".formatted(super.toString(), percentCompleted);
    }
}
