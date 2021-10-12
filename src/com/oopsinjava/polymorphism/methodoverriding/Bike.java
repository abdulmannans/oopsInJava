package com.oopsinjava.polymorphism.methodoverriding;
//Source: https://www.javatpoint.com/
class Vehicle{
    void run(){
        System.out.println("Vehicle Is Running.");
    }
}
public class Bike extends Vehicle{
    void run(){
        System.out.println("Bike Is Running Safely.");
    }
    public static void main(String[] args) {
        Bike b1 = new Bike();
        b1.run();
    }
}
