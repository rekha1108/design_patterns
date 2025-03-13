package com.solid.singleresponsibity;

import java.math.BigDecimal;

public class TransactionOperations {

    public void deposit(BigDecimal amount, int accountNumber){
        AcoountOperations acoountOperations = new AcoountOperations();
        Account account = acoountOperations.getAccount(accountNumber);
       account.setAmount(account.getAmount().add(amount));
    }

    public void withdraw(BigDecimal amount, int accountNumber) {
        AcoountOperations acoountOperations = new AcoountOperations();
        Account account = acoountOperations.getAccount(accountNumber);
        account.setAmount(account.getAmount().subtract(amount));
    }
}
