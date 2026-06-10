package com.sidharth;

import java.util.HashMap;
import java.util.Map;

public class AtmOperationImpl implements AtmOperationInterface{
    Map<Double, String> ministmt = new HashMap<>();
    ATM atm = new ATM();
    @Override
    public void viewBalance() {
        System.out.println("your available balance is: "+atm.getBalance()+"\n");
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if(withdrawAmount<= atm.getBalance()){
            ministmt.put(withdrawAmount," Amount withdrawn");
            System.out.println(" Please collect your withdrawn Amount...\n"+withdrawAmount +"\n");
            atm.setBalance(atm.getBalance()-withdrawAmount);
            viewBalance();
        }else{
            System.out.println("INSUFFICIENT FUNDS !!");
        }

    }

    @Override
    public void depositAmount(double depositAmount) {
        ministmt.put(depositAmount," Amount deposited");
        System.out.println(depositAmount+" Your Amount Deposited sucessfully...\n");
        atm.setBalance(atm.getBalance()+depositAmount);
        viewBalance();
    }

    @Override
    public void viewMiniStatement() {
        for (Map.Entry<Double,String> m: ministmt.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
