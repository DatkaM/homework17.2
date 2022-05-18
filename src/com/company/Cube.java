package com.company;

public class Cube extends Shape{
    public Cube(int a, int b) {
        super(a, b);
    }

        @Override
    public double getPerimeter() {
        System.out.println("Cube's perimeter= "+ 12*getA());
        return 0;
    }
}
