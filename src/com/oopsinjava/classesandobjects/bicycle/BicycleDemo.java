package com.oopsinjava.classesandobjects.bicycle;

public class BicycleDemo {
    // resource: https://docs.oracle.com/javase/tutorial/java/concepts/class.html
    public static void main(String[] args) {

        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();

        //Bike 1
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();

        //Bike 2
        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printStates();


    }
}
