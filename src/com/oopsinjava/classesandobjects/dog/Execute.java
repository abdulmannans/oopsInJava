package com.oopsinjava.classesandobjects.dog;

public class Execute {
    // Reference : https://www.guru99.com/java-oops-class-objects.html

    public static void main(String[] args) {
        Dog chowChow = new Dog();
        chowChow.breed = "Chow Chow";
        chowChow.size ="Medium";
        chowChow.age = 3;
        chowChow.color = "Brown";

        System.out.println(chowChow.getInfo());
    }
}
