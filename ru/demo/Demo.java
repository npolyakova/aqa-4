package ru.demo;

public class Demo extends Demo1 {

    public int b = 2;
    private int a = 1;

    public void setA(int number) {
        if (number > 0) {
            a = number;
        }
    }
    public int getA() {
        return a;
    }

    public static void main(String[] args) {
    }

    protected void randomName() {

    }
}
