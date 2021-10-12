package com.oopsinjava.polymorphism.methodoverloading.mainmethodscenario;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main with String[]");
    }

    public static void main(String args) {
        System.out.println("Main with String");
    }

    public static void main() {
        System.out.println("Main with args");
    }
}
