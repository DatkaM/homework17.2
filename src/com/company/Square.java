package com.company;

public class Square extends Shape{
    public Square(int a, int b) {
        super(a, b);
    }

        @Override
    public double getPerimeter() {
        System.out.println("Square's perimeter= " +(getA()+getB())*2);
        return 0;
    }

}
