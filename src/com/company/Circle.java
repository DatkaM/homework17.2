package com.company;

public class Circle extends Shape {
    private final int Pr = 10;

    public Circle(int a, int b) {
        super(a, b);

    }

    @Override
    public double getPerimeter() {
        System.out.println("Circle's perimeter= " + 2 * Pr);
        return 0;
    }
}
