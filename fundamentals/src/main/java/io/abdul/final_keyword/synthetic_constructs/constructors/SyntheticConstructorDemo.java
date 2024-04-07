package io.abdul.final_keyword.synthetic_constructs.constructors;

public class SyntheticConstructorDemo {
    private NestedClass nestedClass = new NestedClass();

    class NestedClass {
        private NestedClass() {}
    }
}