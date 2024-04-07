package io.abdul.final_keyword.synthetic_constructs.methods;

public class SyntheticMethodDemo {
    class NestedClass {
        private String nestedField;
    }

    public String getNestedField() {
        return new NestedClass().nestedField;
    }

    public void setNestedField(String nestedField) {
        new NestedClass().nestedField = nestedField;
    }
}