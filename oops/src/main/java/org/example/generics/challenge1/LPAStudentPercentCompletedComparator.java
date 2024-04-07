package org.example.generics.challenge1;

import java.util.Comparator;

public class LPAStudentPercentCompletedComparator implements Comparator<LPAStudent> {
    @Override
    public int compare(LPAStudent o1, LPAStudent o2) {
        return Double.valueOf(o1.getPercentCompleted()).compareTo(Double.valueOf(o2.getPercentCompleted()));
    }
}
