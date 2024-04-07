package org.example.mutability.practice1;

import java.util.Arrays;

public class PersonV5 {
    private final String name;
    private final String dob;
    private final PersonV5[] kids;

    public PersonV5(String name, String dob, PersonV5[] kids) {
        this.name = name;
        this.dob = dob;
        assert kids != null;
        this.kids = Arrays.copyOf(kids, kids.length);
    }

    public PersonV5(String name, String dob) {
        this.name = name;
        this.dob = dob;
        this.kids = null;
    }

    public void domainLogic() {
        // data should not be exposed, only features should be exposed
        System.out.println("Running logic with data");
    }

    public void addKid(PersonV5 kid) {
        // validate, verify and add
        System.out.println("Running logic with data");
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
