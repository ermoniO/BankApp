package com.Ermoni.bank_app;

public class BankAccount {
    private double checkingBalance = 0.00;
    private double savingBalance = 0.00;
    final private double checkingOpeningDeposit;

    private final double savingsOpeningDeposit;

    public BankAccount(double checkingOpeningDeposit, double savingsOpeningDeposit) {
        this.checkingOpeningDeposit = checkingOpeningDeposit;
        this.savingsOpeningDeposit = savingsOpeningDeposit;
        checkingBalance += this.checkingOpeningDeposit;
        savingsOpeningDeposit += this.savingsOpeningDeposit;
    }
}
