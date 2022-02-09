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
//Create method for withdrawals for checking and savings account and added condition to prevent overdrafts
    public void checkingWithdrawal(double withdrawalAmount) {
        if (checkingBalance < withdrawalAmount){
            System.out.println("Your account is insufficient for this transaction");
            if(savingsBalance > withdrawalAmount) {
                System.out.println("You need to do a balance transfer from your savings account first");
            }
        } else if (checkingBalance > withdrawalAmount){
            checkingBalance -= withdrawalAmount;
        }
    }
    public void savingsWithdrawal(double withdrawalAmount) {
        if (savingsBalance < withdrawalAmount){
            System.out.println("Your account is insufficient for this transaction");
            if( checkingBalance > withdrawalAmount) {
                System.out.println("You need to do a balance transfer from your checking account first");
            }
        } else if (savingsBalance > withdrawalAmount){
            savingsBalance -= withdrawalAmount;
        }

    }

    //Deduct amount from the savings and add it to the checking
    public void transferToChecking(double transferAmount) {
        if (savingsBalance > transferAmount) {
            savingsBalance -= transferAmount;
            checkingBalance += transferAmount;
            System.out.println("Your transaction is completed");
            System.out.println("Your new savings balance is: " + getSavingsBalance());
            System.out.println("Your new checking balance is: " + getCheckingBalance());
        } else if (savingsBalance < transferAmount) {
            System.out.println("Your account is insufficient for this transaction");
        }
    }

    public void transferToSavings(double transferAmount) {
        if (checkingBalance > transferAmount) {
            checkingBalance -= transferAmount;
            savingsBalance += transferAmount;
            System.out.println("Your transaction is completed");
            System.out.println("Your new checking balance is: " + getCheckingBalance());
            System.out.println("Your new savings balance is: " + getSavingsBalance());
        } else if (checkingBalance < transferAmount) {
            System.out.println("Your account is insufficient for this transaction");
        }
    }

    //Create deposit method for checking and savings account
    public void checkingDeposit(double depositAmount) {
        checkingBalance += depositAmount;
        System.out.println("Your new checking balance is: " + getCheckingBalance());
    }

    public void savingsDeposit(double depositAmount) {
        savingsBalance += depositAmount;
        System.out.println("Your new checking balance is: " + getSavingsBalance());
    }

}
