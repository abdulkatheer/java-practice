package org.example.mutability.practice1;

import java.util.Arrays;

public class PersonV4 {
    private final String name;
    private final String dob;
    private final PersonV4[] kids;

    public PersonV4(String name, String dob, PersonV4[] kids) {
        this.name = name;
        this.dob = dob;
        assert kids != null;
        this.kids = Arrays.copyOf(kids, kids.length);
    }

    public PersonV4(String name, String dob) {
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

    public PersonV4[] getKids() {
        return kids != null ? Arrays.copyOf(kids, kids.length) : null;
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
