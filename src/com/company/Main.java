package com.company;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setPI(3.14);
        circle.setRadius(5);
        circle.toString();
        Circle.circumference();
        Circle.area();
        final double a = Math.PI;
        System.out.println("PI " + a);

    }
}
