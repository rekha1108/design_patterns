package com.solid.singleresponsibity;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args){

        Account account = new Account();
        account.setAccountNumber(1234);
        account.setAccountHolderName("Riyaz");
        account.setAmount(BigDecimal.valueOf(12000));

        AcoountOperations acoountOperations = new AcoountOperations();
        acoountOperations.addAccount(account);


        TransactionOperations transactionOperations = new TransactionOperations();
        transactionOperations.deposit(BigDecimal.valueOf(123),1234);




    }
}
