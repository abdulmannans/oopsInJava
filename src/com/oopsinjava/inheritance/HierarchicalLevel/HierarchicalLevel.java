package com.oopsinjava.inheritance.HierarchicalLevel;
//Source: https://www.javatpoint.com/
public class HierarchicalLevel {
    public static void main(String[] args) {
        Dog dogie = new Dog();
        Cat katie = new Cat();

        dogie.bark();
        dogie.eat();
        System.out.println(" ");
        katie.meow();
        katie.eat();
    }
}
