package com.company;

public class Triangle extends Shape {
    private int c;
    public Triangle(int a, int b,int c) {
        super(a, b);
        this.c= c;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    @Override
    public double getPerimeter() {
        System.out.print("Triangle's perimeter= "+ getA()+getB()+getC());
        return 0;
    }

}
