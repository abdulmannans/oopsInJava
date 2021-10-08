package com.oopsinjava.classesandobjects.pojoclass;

public class Bank {

    public static void main(String[] args) {
        PojoClass avinashPuj = new PojoClass();
        PojoClass alexBrooke = new PojoClass();
        PojoClass imranKhan = new PojoClass();

        avinashPuj.setName("Avinash Puj");
        avinashPuj.setAccountNumber(38764940);
        avinashPuj.setAccountBalance(100);

        alexBrooke.setName("Alex Brooke");
        alexBrooke.setAccountNumber(65283693);
        alexBrooke.setAccountBalance(1000);

        imranKhan.setName("Imran Khan");
        imranKhan.setAccountNumber(86638364);
        imranKhan.setAccountBalance(10000);

        avinashPuj.printStatus();
        alexBrooke.printStatus();
        imranKhan.printStatus();


        imranKhan.transferBalance(imranKhan,avinashPuj,1000);
        imranKhan.transferBalance(imranKhan,alexBrooke,2000);

        avinashPuj.printStatus();
        alexBrooke.printStatus();
        imranKhan.printStatus();
    }
}
