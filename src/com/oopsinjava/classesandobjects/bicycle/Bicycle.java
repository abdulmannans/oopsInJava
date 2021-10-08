package com.oopsinjava.classesandobjects.bicycle;

public class Bicycle {
    // resource: https://docs.oracle.com/javase/tutorial/java/concepts/class.html

    int cadence = 0;
    int speed = 0;
    int gear = 0;

    void changeCadence(int newValue){
        cadence = newValue;
    }

    void changeGear(int newValue){
        gear = newValue;
    }

    void speedUp(int increment){
        speed += increment;
    }

    void applyBrakes(int decrement){
        speed-= decrement;
    }

    void printStates(){
        System.out.println(
                "\nCadence: "+ cadence
                +"\nSpeed: " + speed
                +"\nGear: " + gear
                +"\n"
        );
    }
}
