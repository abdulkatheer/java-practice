package org.example.lamda.learning3;

@FunctionalInterface
public interface Operation<T> {
    T operate(T value1, T value2);
}
