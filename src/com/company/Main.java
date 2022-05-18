package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int a2 = scanner.nextInt();
        int b2 = scanner.nextInt();
        int c2 = scanner.nextInt();

        System.out.println("~~~~~~~~~~~~~~~~~Circle~~~~~~~~~~~~~~~~~~~");
        Shape shape1 = new Circle(a2,b2);
        shape1.getPerimeter();
        System.out.println("\n");


        System.out.println("~~~~~~~~~~~~~~~~~~Cube~~~~~~~~~~~~~~~~~~~~~~~~~");
        Shape shape2 = new Cube(a2,b2);
        shape2.getPerimeter();
        System.out.println();


        System.out.println("~~~~~~~~~~~~~~~~~~Triangle~~~~~~~~~~~~~~~~~~~~~~~~~");
        Shape shape3 = new Triangle(a2,b2,c2);
        shape3.getPerimeter();
        System.out.println("\n");

        System.out.println("~~~~~~~~~~~~~~~~~~Square~~~~~~~~~~~~~~~~~~~~~~~~~");
        Shape shape4 = new Square(a2,b2);
        shape4.getPerimeter();
        System.out.println("\n");

        System.out.println("~~~~~~~~~~~~~~~~~~Rectangle~~~~~~~~~~~~~~~~~~~~~~~~~");
        Shape shape5 = new Rectangle(a2,b2);
        shape5.getPerimeter();
        System.out.println("\n");
    }
}
