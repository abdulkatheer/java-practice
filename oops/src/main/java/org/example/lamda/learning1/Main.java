package org.example.lamda.learning1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    // nested record, interface & enum are implicitly static
    record Person(String firstName, String lastName) {
        @Override
        public String toString() {
            return firstName + " " + lastName;
        }
    }

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>(Arrays.asList(
                new Main.Person("Mohideen Abdul Katheer", "M"),
                new Person("Vinothkumar", "N"),
                new Person("Dhanalakshmi", "N"),
                new Person("Nirmal", "K"),
                new Person("Harihara Narayanan", "K")
        ));

        var personLastNameComparator = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.lastName.compareTo(p2.lastName);
            }
        };

        persons.sort(personLastNameComparator);

        persons.sort(new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                int i = p1.lastName.compareTo(p2.lastName);
                return i == 0 ? p1.firstName.compareTo(p2.firstName) : i;
            }
        });
        System.out.println(persons);

        persons.sort((p1, p2) -> {
            int i = p1.lastName.compareTo(p2.lastName);
            return i == 0 ? p1.firstName.compareTo(p2.firstName) : i;
        });

        Comparator<Person> personComparator = (p1, p2) -> {
            int i = p1.lastName.compareTo(p2.lastName);
            return i == 0 ? p1.firstName.compareTo(p2.firstName) : i;
        };
        System.out.println(personComparator.getClass().getName());

        Comparator<Person> personComparator1 = (Person p1, Person p2) -> {
            int i = p1.lastName.compareTo(p2.lastName);
            return i == 0 ? p1.firstName.compareTo(p2.firstName) : i;
        };
        System.out.println(personComparator1.getClass().getName());

        System.out.println(persons);
    }
}
