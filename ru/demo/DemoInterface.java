package ru.demo;

public interface DemoInterface {

    int a = 2;

    default void method3() {
        System.out.println("Летит");
    }

    void method4();
}
