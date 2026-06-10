package com.sidharth;

public class AtmOperationImpl implements AtmOperationInterface{
    ATM atm = new ATM();
    @Override
    public void viewBalance() {
        System.out.println("your available balance is: "+atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        System.out.println(" Please collect your withdrawn Amount...\n"+withdrawAmount +"\n");
        viewBalance();

    }

    @Override
    public void depositAmount(double depositAmount) {
        System.out.println(depositAmount+" Your Amount Deposited sucessfully...\n");
        atm.setBalance(atm.getBalance()+depositAmount);
        viewBalance();
    }

    @Override
    public void viewMiniStatement() {

    }
}
