package com.Ermoni.bank_app;

public class BankAccount {
    private double checkingBalance = 0.00;
    private double savingsBalance = 0.00;
    final private double checkingOpeningDeposit;

    private final double savingsOpeningDeposit;
//Created constructors
    public BankAccount(double checkingOpeningDeposit, double savingsOpeningDeposit) {
        this.checkingOpeningDeposit = checkingOpeningDeposit;
        this.savingsOpeningDeposit = savingsOpeningDeposit;
        checkingBalance += this.checkingOpeningDeposit;
        savingsBalance += this.savingsOpeningDeposit;
    }
    //Create methods to get the checking and savings balance

    public double getCheckingBalance() {
        return checkingBalance;
    }
     public double getSavingsBalance() {
        return savingsBalance;
     }
//Create constructors for withdrawals for checking and savings account
    public void checkingWithdrawal(double withdrawalAmount) {
        checkingBalance -= withdrawalAmount;
    }
    public void savingsWithdrawal(double savingsWithdrawalAmount) {
        savingsBalance -= savingsWithdrawalAmount;
    }

}
