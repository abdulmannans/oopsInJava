package com.oopsinjava.inheritance.aggregation;
//Source: https://www.javatpoint.com/
class Operation{
    int square(int n){
        return n*n;
    }
}

public class Circle {
    Operation op;
    double pi = 3.14;

    double area(int radius){
        op = new Operation();
        int rSquare = op.square(radius);
        return pi*rSquare;
    }

    public static void main(String[] args) {
        Circle C1 = new Circle();
        double areaOfCircle =C1.area(5);
        System.out.println(areaOfCircle);
    }
}
