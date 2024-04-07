package org.example.mutability.practice1;

import java.util.Arrays;

public class PersonV2 {
    private final String name;
    private final String dob;
    private final PersonV2[] kids;

    public PersonV2(String name, String dob, PersonV2[] kids) {
        this.name = name;
        this.dob = dob;
        this.kids = kids;
    }

    public PersonV2(String name, String dob) {
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

    public PersonV2[] getKids() {
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
