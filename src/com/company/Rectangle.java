package com.company;

public class Rectangle extends Shape{
    public Rectangle(int a, int b) {
        super(a, b);
    }

        @Override
    public double getPerimeter() {
        System.out.println("Rectangle's perimeter= "+getA()+getB()+getA()+getB());
        return 0 ;
    }
}
