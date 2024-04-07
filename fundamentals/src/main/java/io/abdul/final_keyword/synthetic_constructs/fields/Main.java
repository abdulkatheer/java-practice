package io.abdul.final_keyword.synthetic_constructs.fields;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        Field[] fields = SyntheticFieldDemo.NestedClass.class
                .getDeclaredFields();
        System.out.println("This class should contain " + fields.length + " field");

        for (Field f : fields) {
            System.out.println("Field: " + f.getName() + ", isSynthetic: " +
                    f.isSynthetic());
        }
    }
}
