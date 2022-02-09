package com.Ermoni.bank_app;

public class BankApp {
    public static void main(String[] args) {
        BankAccount customerAcct = new BankAccount(6000,7000);
        //System.out.println(customerAcct.getCheckingBalance());
        //System.out.println(customerAcct.getSavingsBalance());

        //customerAcct.checkingWithdrawal(3000);
        //customerAcct.savingsWithdrawal(5000);
        //System.out.println(customerAcct.getCheckingBalance());
        //System.out.println(customerAcct.getSavingsBalance());

        //Checking the transferToChecking method
        //customerAcct.transferToChecking(5000);

        //Test transfer to savings
        //customerAcct.transferToSavings( 7000);

        //Test for checkingDeposit
        //customerAcct.checkingDeposit(500000);

        //Test for savingsDeposit
        customerAcct.savingsDeposit(350000);

    }


}
