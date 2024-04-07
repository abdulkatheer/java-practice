package org.example.generics.challenge1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        QueryList<LPAStudent> lpaStudents = new QueryList<>();

        for (int i = 0; i < 25; i++) {
            lpaStudents.add(new LPAStudent());
        }

        QueryList<LPAStudent> queryItems = new QueryList<>(lpaStudents);
        QueryList<LPAStudent> percentcompleted = queryItems.getMatches("PERCENTCOMPLETED", "50.0");
        print(percentcompleted);

        lpaStudents.sort(Comparator.naturalOrder());
        print(lpaStudents);

        queryItems.sort(new LPAStudentPercentCompletedComparator());
        print(queryItems);

        var s = new QueryList<>();
        s.add(new LPAStudent());
        s.add(new Student());
    }

    private static void print(QueryList<? extends Student> queryList) {
        for (Student student : queryList) {
            System.out.println(student);
        }
        System.out.println();
    }
}
