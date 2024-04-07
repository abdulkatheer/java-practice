package org.example.mutability.practice1;

import java.util.Arrays;

public class PersonV1 {
    private String name;
    private String dob;
    private PersonV1[] kids;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public PersonV1[] getKids() {
        return kids;
    }

    public void setKids(PersonV1[] kids) {
        this.kids = kids;
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
