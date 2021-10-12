package com.oopsinjava.classesandobjects.pojoclass;

public class PojoClass {

    private String name ;
    private int accountNumber;
    private float accountBalance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void transferBalance(PojoClass debitedAccount, PojoClass creditedAccount, float amount){
        debitedAccount.accountBalance = debitedAccount.accountBalance - amount;
        creditedAccount.accountBalance = creditedAccount.accountBalance + amount;
    }

    public void printStatus() {
        System.out.println( "\nname: " + name +
                "\naccountNumber: " + accountNumber +
                "\naccountBalance: " + accountBalance);
    }
}
