package org.example.mutability.practice1;

import java.util.Arrays;

public class PersonV3 {
    private final String name;
    private final String dob;
    private final PersonV3[] kids;

    public PersonV3(String name, String dob, PersonV3[] kids) {
        this.name = name;
        this.dob = dob;
        assert kids != null;
        this.kids = Arrays.copyOf(kids, kids.length);
    }

    public PersonV3(String name, String dob) {
        this.name = name;
        this.dob = dob;
        this.kids = null;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public PersonV3[] getKids() {
        return kids;
    }

    @Override
    public String toString() {
        return "PersonV1{" +
                "name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", kids=" + Arrays.toString(kids) +
                '}';
    }
}
