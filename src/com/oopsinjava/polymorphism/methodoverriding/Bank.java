package com.oopsinjava.polymorphism.methodoverriding;

public class Bank {
    int getRateOfInterest(){
        return 0;
    }
}
class SBI extends Bank{
    int getRateOfInterest(){
        return 8;
    }
}
class ICICI extends Bank{
    int getRateOfInterest(){
        return 7;
    }
}
class AXIS extends Bank{
    int getRateOfInterest(){
        return 9;
    }
}
class Main{
    public static void main(String[] args) {
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        AXIS axis = new AXIS();

        System.out.println("SBI Rate Of Interest:"+ sbi.getRateOfInterest());
        System.out.println("ICICI Rate Of Interest: "+icici.getRateOfInterest());
        System.out.println("AXIS Rate Of Interest: "+axis.getRateOfInterest());
    }
}
