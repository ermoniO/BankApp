package com.Ermoni.bank_app;

public class BankApp {
    public static void main(String[] args) {
        BankAccount customerAcct = new BankAccount(2000,1000);
        System.out.println(customerAcct.getCheckingBalance());
        System.out.println(customerAcct.getSavingsBalance());
    }

}
