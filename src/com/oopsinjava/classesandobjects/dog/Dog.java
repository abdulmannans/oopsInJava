package com.oopsinjava.classesandobjects.dog;

public class Dog {
    // Reference : https://www.guru99.com/java-oops-class-objects.html

    String breed;
    String size;
    int age;
    String color;

    public String getInfo(){
        return ("Breed is: "+breed+"\nSize is: "+size+"\nAge is: "+age+"\nColor is: "+color);
    }

    public static void main(String[] args){
        Dog maltese = new Dog();
        maltese.breed = "Maltese";
        maltese.size = "Small";
        maltese.age = 2;
        maltese.color = "White";

        System.out.println(maltese.getInfo());
    }


}
